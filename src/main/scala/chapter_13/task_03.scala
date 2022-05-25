/*
Напишите функцию, удаляющую каждый второй элемент из
ListBuffer. Попробуйте два способа. Вызовите remove(i) для
всех четных индексов i, начиная с конца списка. Скопируйте
каждый второй элемент в новый список. Сравните произво-
дительность обоих способов.
 */
package chapter_13

object task_03 extends App {
    val buf = scala.collection.mutable.ListBuffer.empty[String]
    buf += "aa"
    buf += "bb"
    buf += "cc"
    buf += "tt"
    buf += "zz"
    print(buf.size, buf)

    println((1.until(buf.size, 2)).reverse.foreach(i => buf.remove(i)))
    println(buf.size, buf)

    val buf_new = scala.collection.mutable.ListBuffer.empty[String]
    buf_new += "aa"
    buf_new += "bb"
    buf_new += "cc"
    buf_new += "tt"
    buf_new += "zz"

    val odd_buf = scala.collection.mutable.ListBuffer.empty[String]
    0.until(buf_new.size, 2).foreach(i => odd_buf += buf_new(i))
    println(odd_buf.size, odd_buf)

}
