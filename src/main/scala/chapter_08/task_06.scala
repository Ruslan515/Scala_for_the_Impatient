/*
Определите абстрактный класс геометрической фигуры Shape
с абстрактным методом centerPoint и подклассы прямоугольника
и окружности, Rectangle и Circle. Реализуйте соответствующие
конструкторы в подклассах и переопределите метод
centerPoint в каждом подклассе.
 */
package chapter_08

object task_06 extends App {
    class Point(val x: Double, val y: Double)

    abstract class Shape {
        def centerPoint: Point
    }

    class Rectangle(val left_high: Point, val right_down: Point) extends Shape {
        def centerPoint = {
            val center = new Point(
                (right_down.x - left_high.x) / 2,
                (left_high.y - right_down.y) / 2
            )
            center
        }
    }

    class Circle(override val centerPoint: Point, val r: Double) extends Shape

    val lh  = new Point(10, 20)
    val rd = new Point(20, 10)
    val rect = new Rectangle(lh, rd)
    println(rect.centerPoint.x, rect.centerPoint.y)

    val cir = new Circle(lh, 10)
    println(cir.centerPoint.x, cir.centerPoint.y)

}
