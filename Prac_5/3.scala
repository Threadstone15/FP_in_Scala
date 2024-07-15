object fibonacci {

    def first_n_fib(n: Int): Int = {
        n match {
            case 0 => 0
            case 1 => 1
            case _ => first_n_fib(n - 1) + first_n_fib(n - 2)
        }
    }

    def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
        println(first_n_fib(i))
    }
    }

    def main(args: Array[String]): Unit = {
        println("Enter number for n: ")
        val n = scala.io.StdIn.readInt()
        println(s"The first $n Fibonacci numbers are:")
        printFibonacci(n)
    }

}