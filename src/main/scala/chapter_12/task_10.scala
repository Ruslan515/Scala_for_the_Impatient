/*
Реализуйте абстракцию управления потоком выполнения
unless, действующую подобно if, но с инвертированным толко-
ванием логического условия. Требуется ли оформить первый
параметр как параметр, вызываемый по имени? Необходим ли
здесь карринг?
 */
package chapter_12

object task_10 extends App {
    def unless(condition: => Boolean)(block: => Unit) {
        if (!condition) block
    }

    unless(30 < 10) { println("unless") }
}
