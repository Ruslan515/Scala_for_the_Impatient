val nums = Array(2, 7, 11, 15)
val target = 9
//for (i <- 0 until(5)) {
//    println(i)
//}
nums.length

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

println(twoSum(nums, target))