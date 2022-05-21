/*
Реализуйте метод corresponds без карринга. Затем попробуйте
вызвать его из предыдущего упражнения. С какими проблема-
ми вы столкнулись?
 */
package chapter_12

import scala.math.Ordering.Boolean

object task_09 extends App {
    val a = Array("Hello", "World")
    val b = Array("hello", "world")
    def corr_my(
                   fun: (String, String) => Boolean,
                   x: Array[String],
                   y: Array[String]
               ) = {
        (a zip b).map(x => fun(x._1, x._2)).reduce(_ & _)
    }
    println(corr_my((x, y) => x.length == y.length, a, b))

}
