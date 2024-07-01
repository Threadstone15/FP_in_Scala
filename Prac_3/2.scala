object str_len {
    
    def filterStringsByLength(strings: List[String]): List[String] = {
        strings.filter(_.length > 5)
    }

    def main(args: Array[String]): Unit = {
        println("Enter the string list (separated by spaces):")
        val string_list = scala.io.StdIn.readLine()
        val StringList = string_list.split(" ").toList
    
        val filtered_list = filterStringsByLength(StringList)
        println(s"Filtered list: $filtered_list")
    }
}
