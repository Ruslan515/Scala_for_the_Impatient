/*
В разделе 13.10 «Функция zip» выражение
(prices zip quantities) map { p => p._1 * p._2 }
выглядит несколько грубовато. Мы
не можем написать (prices zip quantities) map { _ * _ }, потому
что _ * _ – это функция с двумя аргументами, а нам нужна
функция, принимающая один аргумент – кортеж. Метод tupled
класса Function изменяет функцию с двумя аргументами,
превращая ее в функцию, принимающую кортеж. Примените
метод tupled к функции умножения так, чтобы можно было
применить map к списку пар.
 */
package chapter_13

object task_07 extends App {
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)
    val ans = (prices zip quantities) map { p => p._1 * p._2 }
    val ans1 = (prices zip quantities).map(((_:Double) * (_: Int)).tupled)
}
