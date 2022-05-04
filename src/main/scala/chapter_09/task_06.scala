/*
Напишите регулярное выражение для поиска строк в кавыч-
ках "как эта, возможно с \" или \\" в программе на языке Java
или C++. Напишите программу на Scala, которая выводит все
такие строки, найденные в файле с исходными текстами.
 */
package chapter_09

import java.io.PrintWriter
object task_06 extends App {
    val pattern = """^[\S\s]*"[\S\s]*"[\S\s]*\n+""".r

    val out = new PrintWriter("src/main/scala/chapter_09/for_06_out.txt")

    pattern.findAllIn("""в этом тексте "как эта, возможно с \" - давай угадаю
                        |но не эта " строка""".stripMargin).foreach(out.println(_))

    out.close
}
