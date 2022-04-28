package chapter_06

object task_04 extends App {
    class Point private (val x: Double, val y: Double){
        println(x + 100, y + 100)
    }

    object Point{
        def apply(x: Double, y: Double) = new Point(x, y)
    }

    val new_point = Point(5, 11)
    println(new_point.x, new_point.y)
}
