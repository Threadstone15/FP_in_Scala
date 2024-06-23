object payment_sys{

    def salary_aft_tax(salary: Double): Double = {
        salary - (salary * 0.12)
    }
    def pay_nor_hr(hours: Int): Double = {
        250*hours
    }
    def pay_ot_hr(hours: Int): Double = {
        85*hours
    }

    def tot_salary(nr_hr: Int, ot_hr: Int): Double = {
        salary_aft_tax(pay_nor_hr(nr_hr)) + salary_aft_tax(pay_ot_hr(ot_hr))
    }

    def main(args: Array[String]): Unit = {

        val salary = tot_salary(40,30)
        println(s"Total salary is : $salary")


    }

}