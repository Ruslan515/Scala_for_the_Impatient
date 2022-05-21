/*
Измените предыдущую функцию так, чтобы она возвращала
входное значение, соответствующее наибольшему выходному
значению.
Например, вызов largestAt(fun: (Int) => Int, inputs: Seq[Int]) должен вернуть 5.
Не используйте цикл или рекурсию. */
package chapter_12

object task_06 extends App {
    def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(x => (fun(x), x)).reduceLeft((x, y) => if (x._1 > y._1) x else y)._2

    println(largest(x => 10 * x - x * x, 1 to 10))
}
