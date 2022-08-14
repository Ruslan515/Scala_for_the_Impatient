/*
Используя сопоставление с образцом, напишите функцию
swap, которая принимает пару целых чисел и возвращает ту
же пару, поменяв компоненты местами.
 */
package chapter_14

object task_02 extends App {
    def swap(pair_xy: (Int, Int)): (Int, Int) = {
        pair_xy match {
            case xy: (Int, Int) => (xy._2, xy._1)
        }
    }
//    println(swap((1, 2)))
    assert((2, 1) == swap(1, 2))
}
