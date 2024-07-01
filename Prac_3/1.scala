object rev_str {
    
    def reverseString(s: String): String = {
        if (s.isEmpty) ""
        else reverseString(s.tail) + s.head
    }


    def main(args: Array[String]): Unit = {

        println("Enter a string:")
        val string = scala.io.StdIn.readLine()
        println(reverseString(string))
    }
}
