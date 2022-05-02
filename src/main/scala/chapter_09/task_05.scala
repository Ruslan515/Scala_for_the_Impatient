/*
Напишите программу на Scala, которая записывает степени
двойки и их обратные величины в файл с экспонентой от 0
до 20. Расположите числа в столбцах:
1   1
2   0.5
4   0.25
 */
package chapter_09

import java.io.PrintWriter

object task_05 extends App {
    val out = new PrintWriter("src/main/scala/chapter_09/for_05_out.txt")
    for (i <- 1 to 20) {
        val temp = Math.pow(2, i)
        out.println(f"${temp.toInt}\t${1/temp}")
    }
    out.close()
}
