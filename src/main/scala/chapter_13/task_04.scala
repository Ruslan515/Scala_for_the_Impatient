/*
Напишите функцию, принимающую коллекцию строк и ассо-
циативный массив, отображающий строки в целые числа. Она
должна возвращать коллекцию целых чисел, значения кото-
рых соответствуют строкам в ассоциативном массиве, повто-
ряющимся в исходной коллекции. Например, для
Array("Tom","Fred", "Harry") и
Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
функция должна вернуть Array(3, 5). Подсказка: используйте
flatMap для объединения значений типа Option, возвращаемых
методом get.
 */
package chapter_13

object task_04 extends App {
    def fun(list_strings: Array[String], list_hash: Map[String, Int]): Array[Int] = {
        list_strings.flatMap(n => list_hash.get(n))
    }
    val list_strings = Array("Tom", "Fred", "Harry")
    val list_hash = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)

    fun(list_strings, list_hash).foreach(println)

}
