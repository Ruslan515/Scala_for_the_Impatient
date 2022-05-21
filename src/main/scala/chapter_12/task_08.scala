/*
В разделе 12.8 «Карринг» был представлен метод corresponds,
использующий два массива строк. Напишите вызов
corresponds, который проверял бы соответствие длин строк в одном
массиве целочисленным значениям в другом.
 */
package chapter_12

object task_08 {
    val a = Array("Hello", "World")
    val b = Array("hello", "world")
    a.corresponds(b)(_.length == _.length)
}
