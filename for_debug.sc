import scala.collection.mutable.ArrayBuffer

abstract class Item {
    def price: Int
    def description: String
}

class SimpleItem(override val price: Int, override val description: String) extends Item

class Bundle extends Item {
    var items = ArrayBuffer[Item]()
    def price() = items.foldLeft(0)(_+_.price)
    def description() = items.map(_.description).mkString("; ")

    def add_item(x: Item) = items += x
}

val bike = new SimpleItem(10, "bike")
val auto = new SimpleItem(20, "auto")
val house = new SimpleItem(50, "house")

var items = ArrayBuffer[Item]()
items += bike
items += auto
println(items.map(_.price).sum)
