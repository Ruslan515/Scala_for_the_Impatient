/*
Напишите функцию, возвращающую для указанной стро-
ки отображение индексов всех символов. Например, вызов
indexes("Mississippi") должен вернуть ассоциативный массив,
связывающий 'M' со множеством {0}, 'i' – со множеством {1,
4, 7, 10} и т. д. Используйте изменяемый ассоциативный мас-
сив, отображающий символы в изменяемые множества. Как
обеспечить сортировку индексов в пределах множеств?
 */
package chapter_13

import scala.collection.mutable

object task_01 extends App {
    def indexes(s: String) = {
        val idx = new scala.collection.mutable.HashMap[Char, scala.collection.mutable.Set[Int]]
        for (i <- 0 until(s.length)) {
            idx.getOrElseUpdate(s(i), scala.collection.mutable.Set[Int]()) += i
        }
        idx
    }

    (indexes("Mississippi")).map(x => println(f"${x._1}: {", x._2.mkString(","), "}"))
}
