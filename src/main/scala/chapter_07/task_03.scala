/*
Напишите пакет random с функциями nextInt(): Int, nextDouble():
Double и setSeed(seed: Int): Unit. Для генерации случайных чи-
сел используйте линейный конгруэнтный генератор
next = (previous × a + b) mod 2 n ,
где a = 1664525, b = 1013904223 и n = 32, а начальное значение
previous определяется аргументом seed.
 */

package chapter_07

package object random {
    val a = 1664525
    val b = 1013904223
    val n = 32
    private var previous: Double = 42

    def nextInt(): Int = {
        previous = ((previous * a + b) % (scala.math.pow(2, n)))
        previous.toInt
    }

    def nextDouble(): Double = {
        previous = (previous * a + b) % (scala.math.pow(2, n))
        previous
    }

    def setSeed(seed: Int): Unit = {
        previous = seed
    }
}

object task_03 extends App {
    import random._
    random.setSeed(42)
    println(nextInt())
    println(nextDouble(), nextDouble())

}
