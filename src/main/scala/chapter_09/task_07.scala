/*
Напишите программу на Scala, которая читает текстовый файл
и выводит все лексемы, не являющиеся вещественными чис-
лами. Используйте регулярное выражение.
 */
package chapter_09

import scala.io.Source
object task_07 extends App {
    val file_in = "src/main/scala/chapter_09/for_07.txt"
    val pattern = "[\\d]+.[\\d]+".r

    val source = Source.fromFile(file_in)

    for (matchs <- pattern.findAllIn(source.mkString)) {
        println(matchs)
    }

}
