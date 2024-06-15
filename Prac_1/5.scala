object Main_5{

    def easy_pace_time(dis: Int): Int = {
        dis * 8
    }
    def tempo_pace_time(dis: Int): Int = {
        dis * 7
    }

    def main(args: Array[String]): Unit = {
        val tot_time = easy_pace_time(2) + tempo_pace_time(3) + easy_pace_time(2) 
        println(s"Total time is : $tot_time")    
    }
}