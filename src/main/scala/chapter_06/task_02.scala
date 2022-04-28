package chapter_06

object task_02 extends App {

    abstract class UnitConversion {
        def conv(v: Double): Double
    }

    object InchesToCentimeters extends UnitConversion {
        def conv(inch: Double) = inch * 2.5
    }
    object GallonsToLiters {
        def conv(gall: Double) = gall * 3.8
    }
    object MilesToKilometers {
        def conv(mile: Double) = mile * 1.6
    }

    println(MilesToKilometers.conv(100))
}
