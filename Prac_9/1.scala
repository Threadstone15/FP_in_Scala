import scala.io.StdIn.readInt

object cal_interest {
    def cal_interest(amount: Double): Double = {
        amount match {
            case n if n <= 20000 => amount * 0.02
            case n if n <= 200000 => amount * 0.04
            case n if n <= 2000000 => amount * 0.035
            case n if n > 2000000 => amount * 0.065
        }
    }

    def main(args: Array[String]): Unit = {
        println("Enter amount:")
        val amount = readInt().toDouble  
        val interest = cal_interest(amount)
        println("Interest is: %.2f".format(interest))
    }
}
