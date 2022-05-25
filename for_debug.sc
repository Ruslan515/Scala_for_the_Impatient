import Function._
val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)
val ans = (prices zip quantities) map { p => p._1 * p._2 }
val ans1 = (prices zip quantities).map(((_:Double) * (_: Int)).tupled)