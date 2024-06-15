object Main{
    def C_Far(C: Double): Double = {
        C * 1.8000 + 32.00
    }
    def main(args: Array[String]): Unit = {
        val C = 35
        val F = C_Far(C)
        println(s"$C Celsius = $F Fahrenheit")
    }
}