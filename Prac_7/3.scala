import scala.io.StdIn.readLine

def filter_evn_num(num: List[Int]): List[Int] = {
    num.filter(num => num % 2 == 0)
}

def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by spaces:")
    val input = readLine().split(" ").map(_.toInt).toList
    val evn_num = filter_evn_num(input)
    println(s"The list of even numbers is: $evn_num")
}