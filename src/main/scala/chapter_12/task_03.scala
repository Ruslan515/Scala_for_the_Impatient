/*
Реализуйте функцию вычисления факториала с помощью методов
to и reduceLeft без применения цикла или рекурсии.
 */
package chapter_12

import scala.io.StdIn
object task_03 extends App {
    val hight: Int = StdIn.readLine("enter number factorial: ").toInt
    val low = 1
    println((low to hight).reduceLeft(_ * _))

}
