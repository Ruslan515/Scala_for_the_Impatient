/*
Напишите программу, копирующую все элементы из Java-хеша
в Scala-хеш. Используйте операцию импортирования для пере-
именования обоих классов.
 */

package chapter_07

object task_06 extends App {
    import java.util.{HashMap => JavaHashMap}
    import scala.collection.mutable.{HashMap => ScalaHashMap}

    val jhm = new JavaHashMap[String, Int](){
        put("aaa", 1)
        put("bbb", 2)
        put("ccc", 3)
    }

    val shm = ScalaHashMap[String, Int]()

    val itr = jhm.entrySet().iterator()
    while (itr.hasNext()) {
        val key_value = itr.next()
        shm += (key_value.getKey() -> key_value.getValue())
    }
    for ((k, v) <- shm) println(k, v)
}
