package chapter_06

object task_01 extends App {
    object Conversions {

        def inchesToCentimeters(inc: Double) = {
            inc * 2.5
        }

        def gallonsToLiters(gallon: Double) = {
            gallon * 3.8
        }

        def milesToKilometers(mile: Double) = {
            mile * 1.6
        }
    }

    println(Conversions.milesToKilometers(100))
}
