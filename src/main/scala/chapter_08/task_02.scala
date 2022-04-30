package chapter_08

object task_02 extends App {
    class BankAccount(initialBalance: Double) {
        private var balance = initialBalance
        def currentBalance = balance
        def deposit(amount: Double) = { balance += amount; balance }
        def withdraw(amount: Double) = { balance -= amount; balance }
    }

    class SavingsAccount(inBalance: Double, percent: Double) extends BankAccount(inBalance) {
        private var acc = -1
        def earnMonthlyInterest() = {acc = -1; super.deposit(super.currentBalance * percent / 100)}

        override def deposit(amount: Double): Double = {
            acc = acc + 1
            if (acc < 3) super.deposit(amount)
            else super.deposit(amount - 1)
        }

        override def withdraw(amount: Double): Double = {
            acc = acc + 1
            if (acc < 3) super.withdraw(amount)
            else super.withdraw(amount + 1)
        }

    }

    val newAcc = new SavingsAccount(100, 3)
    println(newAcc.currentBalance)

    newAcc.deposit(100)
    println(newAcc.currentBalance)

    newAcc.deposit(100)
    println(newAcc.currentBalance)

    newAcc.deposit(100)
    println(newAcc.currentBalance)

    newAcc.deposit(100)
    println(newAcc.currentBalance)

    newAcc.deposit(100)
    println(newAcc.currentBalance)

    newAcc.withdraw(500)
    println(newAcc.currentBalance)

    newAcc.earnMonthlyInterest()
    println(newAcc.currentBalance)

    newAcc.deposit(100)
    println(newAcc.currentBalance)

}
