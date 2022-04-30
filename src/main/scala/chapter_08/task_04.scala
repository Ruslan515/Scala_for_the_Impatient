/*
Определите абстрактный класс элемента Item с методами
price и description. Определите подкласс простого элемента
SimpleItem, представляющий элемент, цена и описание которо-
го определяются в конструкторе. Используйте тот факт, что
объявление val может переопределять def. Определите класс
Bundle – пакет элементов, содержащий другие элементы. Его
цена должна определяться как сумма цен элементов в паке-
те. Реализуйте также механизм добавления элементов в пакет
и соответствующий метод description.
 */
package chapter_08

import scala.collection.mutable.ArrayBuffer

object task_04 extends App {
    abstract class Item {
        def price: Int
        def description: String
    }

    class SimpleItem(override val price: Int, override val description: String) extends Item

    class Bundle extends Item {
        var items = ArrayBuffer[Item]()
        def price() = items.map(_.price).sum
        def description() = items.map(_.description).mkString("; ")

        def add_item(x: Item) = items += x
    }

    val bike = new SimpleItem(10, "bike")
    val auto = new SimpleItem(20, "auto")
    val house = new SimpleItem(50, "house")
    println(bike.price, bike.description)
    println(auto.price, auto.description)
    println(house.price, house.description)

    val b = new Bundle()
    b.add_item(bike)
    b.add_item(auto)
    b.add_item(house)

    println(b.price, b.description)
}
