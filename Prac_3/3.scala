object arth_mean {

  def arithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    val roundedMean = f"$mean%.2f".toDouble
    roundedMean
  }

  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 20
    val mean = arithmeticMean(num1, num2)
    println(s"Mean of $num1 and $num2 is $mean")
  }

}
