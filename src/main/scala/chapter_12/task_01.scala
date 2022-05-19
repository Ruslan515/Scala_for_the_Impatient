/*
Напишите функцию values(fun: (Int) => Int, low: Int, high: Int),
возвращающую коллекцию из значений в указанном диапазоне.
Например, вызов values(x => x * x, -5, 5) должен вернуть
коллекцию пар (-5, 25), (-4, 16), (-3, 9), ..., (5, 25).
 */
package chapter_12

object task_01 extends App {
    def values(fun: (Int) => Int, low: Int, high: Int) = (low to high).map(x => (x, fun(x)))
    values(x => x * x, -5, 5).foreach(println _)
}
