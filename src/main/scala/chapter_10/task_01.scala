/*
Класс java.awt.Rectangle имеет очень удобные методы translate
и grow, которые, к сожалению, отсутствуют в таких классах,
как java.awt.geom.Ellipse2D. В Scala эту проблему легко испра-
вить. Определите трейт RectangleLike с конкретными методами
translate и grow. Добавьте любые абстрактные методы, которые
потребуются для реализации, чтобы трейт можно было под-
мешивать, как показано ниже:
val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30)
with RectangleLike
egg.translate(10, -10)
egg.grow(10, 20)
 */
package chapter_10

object task_01 extends App {
    trait RectangleLike {
        this: java.awt.geom.Ellipse2D =>
        def translate(x: Int, y: Int): Unit = {
            setFrame(getX + x, getY + y, getWidth, getHeight)
        }

        def grow(x:Int, y: Int): Unit = {
            setFrame(getX, getY, getWidth + 2 * x, getHeight + 2 * y)
        }
    }

    val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike
    egg.translate(10, -10)
    println(egg.x, egg.y, egg.width, egg.height)

    egg.grow(10, 20)
    println(egg.x, egg.y, egg.width, egg.height)



}
