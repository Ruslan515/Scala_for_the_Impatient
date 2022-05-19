/*
Напишите функцию largest(fun: (Int) => Int, inputs: Seq[Int]),
возвращающую наибольшее значение функции внутри заданной
последовательности. Например, вызов
largest(x => 10 * x - x * x, 1 to 10) должен вернуть 25. Не используйте цикл
или рекурсию.
 */
package chapter_12

object task_05 extends App {
    def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(fun).reduceLeft((x, y) => if (x > y) x else y)
    println(largest(x => 10 * x - x * x, 1 to 10))
}
