/*
Напишите программу на Scala, которая читает текстовый
файл, содержащий только вещественные числа, выводит
сумму, среднее, максимальное и минимальное значения.
 */
package chapter_09
import scala.io.Source

object task_04 extends App {
    val file_name = "src/main/scala/chapter_09/for_04.txt"
    val source = Source.fromFile(file_name)
    val tokens = source.mkString.split("\\s+")
    val numbers = tokens.map(_.toDouble)
    println(f"sum = ${numbers.sum}, max = ${numbers.max}, min = ${numbers.min}")

}
