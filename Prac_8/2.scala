import scala.io.StdIn.readInt

object num_categorize {

  def check_num(number: Int): Unit = {
    val categorize: Int => String = {
      case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
      case n if n % 3 == 0 => "Multiple of Three"
      case n if n % 5 == 0 => "Multiple of Five"
      case _ => "Not Multiple of 3 or 5"
    }

    println(categorize(number))
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val number = readInt()
    check_num(number)
  }
}
