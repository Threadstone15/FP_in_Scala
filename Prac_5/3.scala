object fibonacci {

    def first_n_fib(n: Int): List[Int] = {
        if (n == 0) {
            List()
        } else {
            List(0, 1) ++ first_n_fib(n - 1)
        }
    }

    def main(args: Array[String]): Unit = {
        println("Enter number for n: ")
        val n = scala.io.StdIn.readInt()
        println(first_n_fib(n))
    }

}