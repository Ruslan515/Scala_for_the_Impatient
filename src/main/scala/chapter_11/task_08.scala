/*
Реализуйте класс Matrix – выберите сами, какую матрицу
реализовать: 2 × 2, квадратную произвольного размера или
матрицу m × n. Реализуйте операции + и *. Последняя должна также
позволять выполнять умножение на скаляр, например mat * 2.
Единственный элемент матрицы должен быть доступен как mat(row, col).
 */

package chapter_11

object task_08 extends App {
    class Matrix(m: Int, n: Int) {

        private val mat = Array.ofDim[Float](m, n)

        def update(i: Int, j: Int, v: Float) = {mat(i)(j) = v}
        def apply(i: Int, j: Int) = {mat(i)(j)}

        def +(other: Matrix) = {
            val answer = new Matrix(m, n)
            for (i <- 0 until m) {
                for (j <- 0.until(n)) {
                    answer(i, j) = mat(i)(j) + other(i, j)
                }
            }
            answer
        }

        def prtln() = {
            for (i <- 0 until m) {
                for (j <- 0.until(n)) {
                    print(" " + mat(i)(j))
                }
                println()
            }

        }
    }

    val m = 2
    val n = 3

    val m1 = new Matrix(m, n)
    val m2 = new Matrix(m, n)

    for (i <- 0 until m) {
        for (j <- 0.until(n)) {
            m1(i, j) = i * n + j
            m2(i, j) = 2 * (i * n + j)
        }
    }
    println("\t\t\tmatrix 1")
    m1.prtln()
    println("##################################")
    println("\t\t\tmatrix 2")
    m2.prtln()
    println("##################################")

    val sum = m1 + m2
    sum.prtln()

}
