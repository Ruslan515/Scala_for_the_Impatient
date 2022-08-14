/*
Используя сопоставление с образцом, напишите функцию
swap, которая меняет местами первые два элемента массива,
если он имеет длину не меньше двух.
 */
package chapter_14

object task_03 extends App {
    def swap(arr: Array[Int]): Array[Int] = {
        println(arr.mkString)
        val temp = arr match {
            case Array(x, y, rest @ _*) =>  Array(y, x) ++ rest
            case _ => arr
        }
        println(temp.mkString)
        return temp
    }
    println(swap(Array(1, 2, 3, 4, 5)).mkString)
}
