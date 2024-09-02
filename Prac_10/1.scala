import scala.io.StdIn.readInt

object neg_method {

  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")
  
    private val g = gcd(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g
  
    def neg: Rational = new Rational(-numer, denom)
  
    override def toString: String = s"$numer/$denom"
  
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }


  def main(args: Array[String]): Unit = {
    println("Enter numerator:")
    val numer = readInt()

    println("Enter denominator:")
    val denom = readInt()

    val rational = new Rational(numer, denom)
    println(s"The negation of $rational is: ${rational.neg}")
  }
}
