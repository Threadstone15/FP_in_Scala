import scala.io.StdIn.readInt

object sub_operation {

  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")
    
    private val g = gcd(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g
    
    def neg: Rational = new Rational(-numer, denom)
    
    def sub(that: Rational): Rational = {
      new Rational(
        numer * that.denom - that.numer * denom,
        denom * that.denom
      )
    }
    
    override def toString: String = s"$numer/$denom"
    
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {

    println("Enter the first numerator:")
    val numer_1 = readInt()

    println("Enter the first denominator:")
    val denom_1 = readInt()

    println("Enter the second numerator:")
    val numer_2 = readInt() 

    println("Enter the second denominator:")
    val denom_2 = readInt()

    val rational_1 = new Rational(numer_1, denom_1)
    val rational_2 = new Rational(numer_2, denom_2)

    val result = rational_1.sub(rational_2)

    println(s"The subtraction of $rational_1 and $rational_2 is: $result")

  }
}
