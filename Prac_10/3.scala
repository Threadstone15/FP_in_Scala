import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
import scala.io.StdIn.readDouble

object bank_opp {

  class Account(val account_num: String, var balance: Double) {
  
    def deposit(amount: Double): Unit = {
      if (amount > 0) balance += amount
    }

    def withdraw(amount: Double): Boolean = {
      if (amount > 0 && balance >= amount) {
        balance -= amount
        true
      } else false
    }

    def transfer(amount: Double, to: Account): Boolean = {
      if (withdraw(amount)) {
        to.deposit(amount)
        true
      } else false
    }

    override def toString: String = s"Account($account_num, $balance)"
  }

  def main(args: Array[String]): Unit = {
     
    print("Enter 1st account number: ")
    val account_num_1 = readLine()
    
    print("Enter 1st account balance: ")
    val balance_1 = readDouble()

    print("Enter 2nd account number: ")
    val account_num_2 = readLine()
    
    print("Enter 2nd account balance: ")
    val balance_2 = readDouble()

    val acc_1 = new Account(account_num_1, balance_1) 
    val acc_2 = new Account(account_num_2, balance_2)

    print("Enter amount to transfer: ")
    val amount = readDouble()

    acc_1.transfer(amount, acc_2)

    println(s"Account 1 after transfer: $acc_1")  
    println(s"Account 2 after transfer: $acc_2") 
  }
}
