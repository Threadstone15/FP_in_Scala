object Main {
    def Area_Disk(r: Double): Double = {
        math.Pi * r * r
    }

    def main(args: Array[String]): Unit = {
        val r = 5
        val area = Area_Disk(r)
        println(s"Area of the disk with radius $r is $area")
    }
}
