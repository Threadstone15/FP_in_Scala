import scala.collection.mutable

object inventory_store {

  var inventory_1: Map[Int, (String, Int, Int)] = Map(
    1 -> ("Pencil", 55, 25),
    2 -> ("Pen", 100, 50),
    3 -> ("Marker", 75, 35),
    4 -> ("Eraser", 45, 10)
  )

  var inventory_2: Map[Int, (String, Int, Int)] = Map(
    4 -> ("Ruler", 45, 30),
    5 -> ("Book", 150, 100),
    2 -> ("Pen", 10, 50),
    3 -> ("Marker", 65, 35),
    6 -> ("Paper", 300, 200),
    7 -> ("Pencil Box", 350, 250)
  )

  def all_pro_names(inventory: Map[Int, (String, Int, Int)]): Iterable[String] = {
    inventory.values.map(_._1)
  }

  def cal_tot_values(inventory: Map[Int, (String, Int, Int)]): Double = {
    inventory.values.map { case (_, quantity, price) => quantity * price }.sum
  }

  def check_emt(inventory: Map[Int, (String, Int, Int)]): Boolean = {
    inventory.isEmpty
  }

  def merge_inv(inventory_1: Map[Int, (String, Int, Int)], inventory_2: Map[Int, (String, Int, Int)]): Map[Int, (String, Int, Int)] = {
    val merged = mutable.Map[Int, (String, Int, Int)]() ++ inventory_1
    for ((id, (name, quantity, price)) <- inventory_2) {
      if (merged.contains(id)) {
        val (ext_name, exting_quantity, ext_price) = merged(id)
        merged(id) = (ext_name, exting_quantity + quantity, Math.max(ext_price, price))
      } else {
        merged(id) = (name, quantity, price)
      }
    }
    merged.toMap
  }

  def check_exist(inventory: Map[Int, (String, Int, Int)], product_id: Int): Unit = {
    inventory.get(product_id) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID: $product_id")
        println(s"Name: $name")
        println(s"Quantity: $quantity")
        println(s"Price: $price")
      case None =>
        println(s"Product with ID $product_id does not exist.")
    }
  }

  def add_product_to_inventory(inventory: Map[Int, (String, Int, Int)], product_id: Int, name: String, quantity: Int, price: Int): Map[Int, (String, Int, Int)] = {
    inventory + (product_id -> (name, quantity, price))
  }

  def add_product(): Unit = {
    println("Enter the inventory number (1 or 2):")
    val inventory_number = scala.io.StdIn.readInt()
    println("Enter product ID:")
    val product_id = scala.io.StdIn.readInt()
    println("Enter product name:")
    val name = scala.io.StdIn.readLine()
    println("Enter product quantity:")
    val quantity = scala.io.StdIn.readInt()
    println("Enter product price:")
    val price = scala.io.StdIn.readInt()

    if (inventory_number == 1) {
      inventory_1 = add_product_to_inventory(inventory_1, product_id, name, quantity, price)
    } else if (inventory_number == 2) {
      inventory_2 = add_product_to_inventory(inventory_2, product_id, name, quantity, price)
    } else {
      println("Invalid inventory number")
    }
  }

  def main(args: Array[String]): Unit = {

    var continue = true

    while (continue) {

      println("1 - Retrieve all product names from inventory_1 or 2")
      println("2 - Calculate the total value of all products in inventory_1 or 2")
      println("3 - Check if inventory_1 or 2 is empty")
      println("4 - Merge inventory_1 and inventory_2")
      println("5 - Check if a product exists and print its details")
      println("6 - Add a product to inventory")
      println("7 - Exit")
      println("Enter your choice:")
      val choice = scala.io.StdIn.readInt()

      choice match {
        case 1 =>
          println("Enter the inventory number (1 or 2):")
          val inventory_number = scala.io.StdIn.readInt()
          val inventory_tmp = if (inventory_number == 1) inventory_1 else inventory_2
          println("Product names in inventory_1:")
          all_pro_names(inventory_tmp).foreach(println)
        case 2 =>
            println("Enter the inventory number (1 or 2):")
          val inventory_number = scala.io.StdIn.readInt()
          val inventory_tmp = if (inventory_number == 1) inventory_1 else inventory_2
          println(s"Total value of all products in inventory_1: ${cal_tot_values(inventory_tmp)}")
        case 3 =>
          println("Enter the inventory number (1 or 2):")
          val inventory_number = scala.io.StdIn.readInt()
          val inventory_tmp = if (inventory_number == 1) inventory_1 else inventory_2
          if (check_emt(inventory_tmp)) println("Inventory" + inventory_number + " is empty")
          else println("Inventory " + inventory_number + " is not empty")
        case 4 =>
          val merged_inventory = merge_inv(inventory_1, inventory_2)
          println("Merged inventory:")
          merged_inventory.foreach { case (id, (name, quantity, price)) =>
            println(s"ID: $id, Name: $name, Quantity: $quantity, Price: $price")
          }
        case 5 =>
          println("Enter product ID to check:")
          val product_id = scala.io.StdIn.readInt()
          println("Enter the inventory number (1 or 2):")
          val inventory_number = scala.io.StdIn.readInt()
          if (inventory_number == 1) {
            check_exist(inventory_1, product_id)
          } else if (inventory_number == 2) {
            check_exist(inventory_2, product_id)
          } else {
            println("Invalid inventory number")
          }
        case 6 =>
          add_product()
        case 7 =>
          continue = false
        case _ =>
          println("Invalid choice")
      }
    }
  }
}
