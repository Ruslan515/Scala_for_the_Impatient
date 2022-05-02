/*
Определите класс квадрата Square, наследующий класс java.
awt.Rectangle и имеющий три конструктора: один, создающий
квадрат по указанным координатам угла и ширине, другой,
создающий квадрат с углом в точке (0, 0) с указанной ши-
риной, и третий, создающий квадрат с углом в точке (0, 0)
с шириной 10.
 */
package chapter_08

object task_07 extends App {
    class Square extends java.awt.Rectangle(0, 0, 10, 10) {
        def this(width: Int) {
            this()
            this.width = width
        }

        def this(x: Int, y: Int, width: Int) {
            this()
            this.x = x
            this.y = y
            this.width = width
        }
    }

    val sq1 = new Square
    val sq2 = new Square(15)
    val sq3 = new Square(3, 15, 111)

    println(f"new Square. x = ${sq1.x}, y = ${sq1.y}, width = ${sq1.width}")
    println(f"new Square(15). x = ${sq2.x}, y = ${sq2.y}, width = ${sq2.width}")
    println(f"new Square(3, 15, 111). x = ${sq3.x}, y = ${sq3.y}, width = ${sq3.width}")
}
