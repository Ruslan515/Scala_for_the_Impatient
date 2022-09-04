/*
Напишите класс, демонстрирующий все возможные способы
размещения аннотаций. В качестве образцовой используйте
аннотацию @deprecated.
 */
package chapter_15

object task_02 extends App {
    @deprecated(message = "use fact")
    def fact(n: Int): Int = n * n
    println(fact(3))
}
