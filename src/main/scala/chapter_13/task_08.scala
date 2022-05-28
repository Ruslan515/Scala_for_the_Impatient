/*
Напишите функцию, превращающую массив значений Double
в двумерный массив. Число колонок должно передаваться
в виде параметра. Например, для Array(1, 2, 3, 4, 5, 6) и трех
колонок функция должна вернуть
Array(Array(1, 2, 3), Array(4,5, 6)).
Используйте метод grouped.
 */
package chapter_13

object task_08 extends App {
    def convert(arr: Array[Int], n: Int) = arr.grouped(n).toArray
    val arr = Array(1, 2, 3, 4, 5, 6)
    val n = 3
    val conv_arr = convert(arr, n)
    for (i <- 0.until(conv_arr.length)) {
        for (j <- 0.until(n))
            print(f"${conv_arr(i)(j)}\t")
        println()
    }

}
