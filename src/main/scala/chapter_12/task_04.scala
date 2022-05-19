/*
Предыдущая реализация должна предусматривать специаль-
ный случай, когда n < 1. Покажите, как избежать этого с помощью
foldLeft. (Ознакомьтесь с описанием foldLeft в Scala-
doc. Этот метод напоминает reduceLeft, за исключением того,
что первое значение в цепочке поставляется в вызове.)
 */
package chapter_12

import scala.io.StdIn

object task_04 extends App {
    val hight: Int = StdIn.readLine("enger hight: ").toInt
    println((1 to hight).foldLeft(1)(_ * _))
}
