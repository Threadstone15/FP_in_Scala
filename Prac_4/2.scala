object pattn_match{

    def tak_int():Int={
        println("Enter an integer:")
        scala.io.StdIn.readInt()
    } 
    def conditiond(number: Int):Unit={
        number match{
            case x if x<= 0 => println("Negative/Zero is input")
            case x if x%2 == 0 => println("Even number")
            case _ => println("Odd number")
        }
    }
    def main(args: Array[String]): Unit = {
        val number = tak_int()
        conditiond(number)
    }



}