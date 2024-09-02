import scala.io.StdIn._

object bank_system {

  class Account(val accountNumber: String, var balance: Double) {
  
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

    override def toString: String = s"Account($accountNumber, $balance)"
  }

  class Bank(val accounts: List[Account]) {
    
    def accountsWithNegativeBalances: List[Account] = {
      accounts.filter(_.balance < 0)
    }

    def totalBalance: Double = {
      accounts.map(_.balance).sum
    }

    def applyInterest(): Unit = {
      accounts.foreach { account =>
        if (account.balance > 0) {
          account.deposit(account.balance * 0.05)
        } else {
          account.withdraw(account.balance.abs * 0.1)
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {

    println("Enter the number of accounts:")
    val numAccounts = readInt()

    val accounts = (1 to numAccounts).map { i =>
      println(s"Enter account number $i:")
      val accountNumber = readLine()
      println(s"Enter initial balance for account $i:")
      val balance = readDouble()
      new Account(accountNumber, balance)
    }.toList

    val bank = new Bank(accounts)

    println("Accounts with negative balances:")
    println(bank.accountsWithNegativeBalances)

    println("Total balance of all accounts:")
    println(bank.totalBalance)

    bank.applyInterest()
    println("Final balances after applying interest:")
    bank.accounts.foreach(println)
  }
}
