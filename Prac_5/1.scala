object invt_management {

  def get_pro_list(): Array[String] = {
    println("Enter product name (type 'done' to finish):")
    val product_name = scala.io.StdIn.readLine()
    if (product_name == "done") {
      Array()
    } else {
      Array(product_name) ++ get_pro_list()
    }
  }

  def print_pro_list(pro_list: Array[String]): Unit = {
    for (i <- pro_list.indices) {
      println(s"${i+1}) ${pro_list(i)}")
    }
  }

  def tot_products(pro_list: Array[String]): Int = {
    pro_list.length
  }

  def main(args: Array[String]): Unit = {
    val pro_list = get_pro_list()
    print_pro_list(pro_list)
    println(s"Total products: ${tot_products(pro_list)}")
  }
}
