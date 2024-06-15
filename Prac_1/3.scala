object main_3{
    def vol_sphere(r: Double): Double = {
        4.0 / 3.0 * math.Pi * r * r * r
    }
    def main(args : Array[String]): Unit = {
        val r = 5
        val vol = vol_sphere(r)
        println(s"Volume is : $vol")
    }
}