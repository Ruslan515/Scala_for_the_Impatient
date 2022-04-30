/*
Спроектируйте класс точки Point, значения координат x и y
которой передаются конструктору. Реализуйте подкласс точки
с подписью LabeledPoint, конструктор которого будет прини-
мать строку с подписью и значения координат x и y, например:
new LabeledPoint("Black Thursday", 1929, 230.07)
 */
package chapter_08

object task_05 extends App {
    class Point(val x: Double, val y: Double)

    class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y)

    val my_point = new Point(10, 20)
    val my_point_label = new LabeledPoint("Black Thursday", 1929, 230.07)
    println(my_point.x, my_point.y)
    println(my_point_label.label, my_point_label.x, my_point_label.y)
}
