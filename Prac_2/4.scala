object movie_hall{
    
    def per_cost_by_att(n: Int): Double = {
        3*n + 500
    }
    def num_of_att(tik_price: Int): Int = {
        120 + -((tik_price-15)*4)
    }
    def profit(tik_price: Int): Double = {
        ((num_of_att(tik_price)*tik_price) - per_cost_by_att(num_of_att(tik_price)))
    }




    def main (args: Array[String]): Unit = {

        println(s"Profit is : ${profit(25)}")
    }
}