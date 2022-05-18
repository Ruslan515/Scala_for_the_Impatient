/*
Реализуйте класс Fraction с операциями + - * /. Реализуйте
нормализацию рациональных чисел, например чтобы число
15/–6 превращалось в –5/2, а также деление на наибольший
общий делитель, как показано ниже:
class Fraction(n: Int, d: Int) {
private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
override def toString = num + "/" + den
def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)
...
}
 */
package chapter_11

import scala.math.abs

object task_03 extends App {
    class Fraction(n: Int, d: Int) {
        private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
        private val den: Int = if (d == 0) 0 else d * sign(d) /gcd(n ,d);
        override def toString = num + "/" + den

        def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
        def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

        def +(other: Fraction) = new Fraction(num * other.den + den * other.num, den * other.den)
        def -(other: Fraction) = new Fraction(num * other.den - den * other.num, den * other.den)
        def *(other: Fraction) = new Fraction(num * other.num, den * other.den)
        def /(other: Fraction) = new Fraction(num * other.den, den * other.num)

    }

    val a1 = new Fraction(15, -6)
    println(a1)

    val a2 = new Fraction(2, -5)
    println(a1*a2)


}
