/*
Реализуйте функцию, действующую подобно mkString, исполь-
зуя reduceLeft.
 */
package chapter_13

object task_05 extends App {
    def fun(between: String) = {
        ???
    }
    val a = Array(1, 7, 2, 9)
    println(a.mkString("start\t", "#", "\tend"))

    println("start\t" + a.reduceLeft((x: Any, y: Any) => x + "#" + y) + "\tend")
}
