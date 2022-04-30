/*
Определите класс CheckingAccount, наследующий класс BankAccount,
который взимает $1 комиссионных за каждую операцию
пополнения или списания.
 */
package chapter_08

object task_01 extends App {
    class BankAccount(initialBalance: Double) {
        private var balance = initialBalance
        def currentBalance = balance
        def deposit(amount: Double) = { balance += amount; balance }
        def withdraw(amount: Double) = { balance -= amount; balance }
    }

    class CheckingAccount(tBalance: Double, commission: Double) extends BankAccount(tBalance) {
        override def deposit(amount: Double): Double = super.deposit(amount - commission)
        override def withdraw(amount: Double): Double = super.withdraw(amount + commission)

    }

    val commission = 1
    val t1 = new CheckingAccount(10, commission)
    println(t1.currentBalance)

    t1.deposit(10)
    println(t1.currentBalance)

    t1.withdraw(5)
    println(t1.currentBalance)
}
