object Main_4{
    def Shippping_Cost(num_copies: Int): Double = { 
        if (num_copies <= 50) {
            num_copies * 3
    }
        else {
            (num_copies - 50) * 0.75 + 50 * 3
        }
    }
    def Store_Dis(price: Double): Double = {
        price * 0.6
    }
    def Tot_Cost(num_copies: Int, price: Double): Double = {
        Shippping_Cost(num_copies) + Store_Dis(price)
    }
    def main(args: Array[String]): Unit = {
        val num_copies = 60
        val price = 24.95
        val tot_cost = Tot_Cost(num_copies, price)
        println(s"Total cost is : $tot_cost")
    }

}