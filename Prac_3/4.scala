object even_sm_calc {
  
  def sumOfEvens(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by spaces:")
    val input = scala.io.StdIn.readLine()
    val numbers = input.split(" ").map(_.toInt).toList
    
    val sum = sumOfEvens(numbers)
    println(s"The sum of all even numbers in the list is: $sum")
  }
}
