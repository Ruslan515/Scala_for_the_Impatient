/*
Напишите на языке Scala код, который размещает строки
в файле в обратном порядке (последнюю делает первой и т. д.).
 */
package chapter_09
import java.io.PrintWriter
import scala.io.Source

object task_01 extends App {
    val file_name_in = "src/main/scala/chapter_09/for_01_in.txt"
    val file_name_out = "src/main/scala/chapter_09/for_01_out.txt"
    val source = Source.fromFile(file_name_in)
    val lines = source.getLines().toArray

    val out = new PrintWriter(file_name_out)
    for (line <- lines.reverse) out.println(line)
    out.close()

}
