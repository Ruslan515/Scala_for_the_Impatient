val m = 2
val n = 3
val matrix = Array.ofDim[Float](m, n)
matrix(0)(0) = 1
matrix(1)(1) = 2
val matrix1 = Array.ofDim[Float](m, n)
matrix1(1)(1) = 1

matrix.foreach(row.foreach(printlen))