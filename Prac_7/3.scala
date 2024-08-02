import scala.io.StdIn.readLine

object find_prime{


    def filterPrime(numbers: List[Int]): List[Int] = {
        numbers.filter(num => num > 1 && (num == 2 || !(2 until num).exists(i => num % i == 0)))
    }

    def main(args: Array[String]): Unit = {
        println("Enter a list of integers separated by spaces:")
        val input = readLine().split(" ").map(_.toInt).toList
        val prime_num = filterPrime(input)
        println(s"The list of prime numbers is: $prime_num")
    }

}

