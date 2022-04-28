/*
Напишите приложение на языке Scala, используя трейт App,
которое выводит аргументы командной строки в обратном
порядке, разделяя их пробелами. Например, команда scala
Reverse Hello World должна вывести World Hello
 */
package chapter_06

object task_05 extends App {
    if (args.length > 1) println(args.reverse.mkString("\t"))
}
