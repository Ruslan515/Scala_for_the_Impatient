/*
Напишите программу на языке Scala, которая читает файл
с символами табуляции, заменяя их пробелами так, чтобы
сохранить правильное расположение границ столбцов, и
записывает результат в тот же файл.
 */
package chapter_09
import java.io.PrintWriter
import scala.io.Source

object task_02 extends App {
    val file_name_in = "src/main/scala/chapter_09/for_02.csv"
    val file_name_out = "src/main/scala/chapter_09/for_02_out.csv"
    val source = Source.fromFile(file_name_in)
    val lines = source.mkString.replace("\t", " ")

    val out = new PrintWriter(file_name_out)
    out.println(lines)
    out.close()

}
