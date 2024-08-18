import  scala.io.StdIn.readInt

object int_matching {
    
    def int_matching(number: Int): Unit = {
        val categorize: Int => String = {
            case n if n <=0 => "Negative"
            case n if n % 2 == 0 => "Even"
            case _ => "Odd"
        }
        println(categorize(number))
    }

    def main(args: Array[String]): Unit = {
        println("Enter a number:")
        val number = readInt()
        int_matching(number)
    }
}