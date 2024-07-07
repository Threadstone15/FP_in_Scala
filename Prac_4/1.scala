object inventory{

    def add_itm(itm_qty_list: Array[Int], itm_list: Array[String]): Unit = {
        println("Enter item name:")
        val item_name = scala.io.StdIn.readLine()
        if (itm_list.contains(item_name)) {
            val index = itm_list.indexOf(item_name)
            println("Enter item quantity:")
            val item_quantity = scala.io.StdIn.readInt()
            itm_qty_list(index) += item_quantity
            println("Item updated successfully")
        }
        else {
            println("Item does not exist")
        }
    }

    def sel_itm(itm_qty_list: Array[Int], itm_list: Array[String]): Unit = {
        println("Enter item name:")
        val item_name = scala.io.StdIn.readLine()
        if (itm_list.contains(item_name)) {
            val index = itm_list.indexOf(item_name)
            println("Enter item quantity:")
            val item_quantity = scala.io.StdIn.readInt()
            if(item_quantity>itm_qty_list(index)) println("Item quantity not available")
            else
            itm_qty_list(index) -= item_quantity
            println("Item updated successfully")
        }
        else {
            println("Item does not exist")
        }
    }

    def show_lst(itm_qty_list: Array[Int], itm_list: Array[String]): Unit = {
        for (i <- itm_list.indices) {
        println(s"${itm_list(i)}: ${itm_qty_list(i)}")
        }

    }


    def main(args: Array[String]): Unit = {
        val itm_name = Array("pen", "pencil", "ruler", "book", "eraser")
        val itm_qty = Array(10, 20, 30, 40, 50)

        while (true) {
            println("1-add item, 2-delete item, 3-display item list, 4-exit")
            val choice = scala.io.StdIn.readInt()
            choice match {
                case 1 => add_itm(itm_qty, itm_name)
                case 2 => sel_itm(itm_qty, itm_name)
                case 3 => show_lst(itm_qty, itm_name)
                case 4 => sys.exit(0)
            }
        }
        

    }


}