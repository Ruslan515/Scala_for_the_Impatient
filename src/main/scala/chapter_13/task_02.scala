/*
Реализуйте предыдущее упражнение с использованием неиз-
меняемого ассоциативного массива символов в списки.
 */
package chapter_13

object task_02 extends App {
    def indexes(s: String) = {
        var idx = Map[Char, List[Int]]()
        for (i <- 0 until(s.length)) {
            idx = idx.updated(s(i), idx.getOrElse(s(i), Nil) :+ i)
        }
        idx
    }

    (indexes("Mississippi")).map(x => println(f"${x._1}: {", x._2.mkString(","), "}"))
}
