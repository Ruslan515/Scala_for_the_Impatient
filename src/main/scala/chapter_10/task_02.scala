/*
Определите класс OrderedPoint, подмешав scala.math.Ordered
[Point] в java.awt.Point. Используйте лексикографическое упо-
рядочение, то есть (x, y) < (x′, y′), если x < x′ или x = x′ и y < y′.
 */
package chapter_10

import java.awt.Point

object task_02 extends App {
    class OrderedPoint(x: Int, y: Int) extends Point(x, y) with scala.math.Ordered[Point] {
        def compare(other: Point): Int = {
            if ((this.x - other.x) == -1) {
                -1
            }
            else if ((this.x - other.x) == 0) {
                if ((this.x - other.x) == -1) {
                    -1
                }
                else {
                    0
                }
            }
            else {
                0
            }
        }
    }

    val point_1 = new OrderedPoint(100, 50)
    val point_2 = new OrderedPoint(100, 50)
    println(point_1 == point_2)

    val point_3 = new OrderedPoint(99, 6)
    val point_4 = new OrderedPoint(100, 6)
    println(point_3 < point_4)

    val point_5 = new OrderedPoint(100, 99)
    val point_6 = new OrderedPoint(100, 1)
    println(point_5 < point_6)

}
