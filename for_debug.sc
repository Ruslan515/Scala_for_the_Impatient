val a = Array(1, 1, 2, 3, 77, -100, 0)
a.reduceLeft[Int]((a,b) => if (a>b) a else b)
