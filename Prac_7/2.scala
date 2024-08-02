import scala.io.StdIn.readLine

object cal_sqr{

    def cal_sqr(num: List[Int]): List[Int] = {
        num.map(num => num * num)
    }

    def main(args: Array[String]): Unit = {
        println("Enter a list of integers separated by spaces:")
        val input = readLine().split(" ").map(_.toInt).toList
        val sqr_num = cal_sqr(input)
        println(s"The list of square numbers is: $sqr_num")
    }

}