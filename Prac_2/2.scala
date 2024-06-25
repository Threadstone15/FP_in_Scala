object fun_elv{
    def inc_num(n: Int): Int = n + 1
    def dec_num(n: Int): Int = n - 1

    def function_elv(): Unit={
        var a = 2
        var b = 3
        var c = 4
        var d = 5
        var k = 4.3f

        //println( - -b * a + c * d - -)
        println(inc_num(b)*a+c*dec_num(d))
        //println(a++)
        println(inc_num(a))
        //println (–2 * ( g – k ) +c)
        println(-2*(-k)+c)
        //println (c=c++)
        println(inc_num(c))
        //println (c=++c*a++)
        println(inc_num(c)*inc_num(a))
    }
    def main(args: Array[String]): Unit ={
        function_elv()
    }


}