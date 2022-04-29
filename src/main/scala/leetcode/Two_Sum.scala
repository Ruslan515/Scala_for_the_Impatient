package leetcode

object Two_Sum extends App {
    val nums = Array(2, 7, 11, 15)
    val target = 9

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        for (i <- 0 until nums.length) {
            val one = nums(i)
            val two = target - one
            for (j <- i + 1 until(nums.length) ){
                if (nums(j) == two) {
                    val ans = Array(i, j)
                    return ans
                }
            }
        }
        val ans = Array(-1, -1)
        ans
    }

    val answer: Array[Int] = twoSum(nums, target)
    println(answer(0), answer(1))
}
