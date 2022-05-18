/*
Реализуйте класс Money с полями для выражения суммы в дол-
ларах и центах. Реализуйте операторы +, -, а также операторы
сравнения == и <. Например, выражение Money(1, 75) + + Money(0,
50) == Money(2, 25) должно возвращать true. Следует ли также
реализовать операторы * и /? Почему «да» или почему «нет»?
 */
package chapter_11

object task_04 extends App {
    class Money(d: Int, c: Int) {
        private val doll: Int = d
        private val cent: Int = c
        override def toString = f"[$d $$ $c c]"

        def +(other: Money) = {
            val all_cent = (doll * 100 + cent) + (other.doll * 100 + other.cent)
            new Money(all_cent / 100, all_cent % 100)
        }

        def -(other: Money) = {
            val all_cent = (doll * 100 + cent) - (other.doll * 100 + other.cent)
            new Money(all_cent / 100, all_cent % 100)
        }

        def ==(other: Money) = {
            val all_cent_this = doll * 100 + cent
            val all_cent_other = other.doll * 100 + other.cent
            all_cent_this == all_cent_other
        }

        def <(other: Money) = {
            val all_cent_this = doll * 100 + cent
            val all_cent_other = other.doll * 100 + other.cent
            all_cent_this < all_cent_other
        }
    }

    val m1 = new Money(1, 75)
    val m2 = new Money(0, 50)
    val m3 = new Money(2, 25)

    val ans = m1 + m2
    println(ans)
    println(ans == m3)

    println(f"($m1 <  $m2) == ${m1<m2}")


}
