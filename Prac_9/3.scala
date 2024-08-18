object convert {

    def toUpper(str: String): String = {
        str.map(c => if (c >= 'a' && c <= 'z') (c - 32).toChar else c)
    }

    def toLower(str: String): String = {
        str.map(c => if (c >= 'A' && c <= 'Z') (c + 32).toChar else c)
    }

    def substring(str: String, start: Int, end: Int): String = {
        var result = ""
        for (i <- start until end) {
            result += str(i)
        }
        result
    }

    def formatNames(name: String)(format_fun: String => String): String = {
        format_fun(name)
    }

    def main(args: Array[String]): Unit = {
        val names = List(
            ("Benny", toUpper),
            ("Niroshan", (s: String) => toUpper(substring(s, 0, 2)) + substring(s, 2, s.length)),
            ("Saman", toLower),
            ("Kumara", (s: String) => toUpper(substring(s, 0, 1)) + substring(s, 1, s.length - 1) + toUpper(substring(s, s.length - 1, s.length)))
        )

        names.foreach(name => println(formatNames(name._1)(name._2)))
    }

}
