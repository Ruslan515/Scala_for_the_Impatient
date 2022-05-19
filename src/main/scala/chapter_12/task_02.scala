/*
Как получить наибольший элемент массива с помощью метода reduceLeft?
 */
package chapter_12

object task_02 extends App {
    val arr = Array(1, 1, 2, 3, 77, -100, 0)
    println(arr.reduceLeft((x, y) => if (x > y) x else y))
}
