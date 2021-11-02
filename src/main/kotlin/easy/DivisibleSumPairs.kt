package easy

fun main() {
    println(divisibleSumPairs(6, 3, arrayOf(1, 3, 2, 6, 1, 2)))
}

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var count = 0
    for (i in ar.indices) {
        for (j in i + 1 until ar.size) {
            if ((ar[i] + ar[j]) % k == 0) {
                //println("($i,$j) -> ar[$i] + ar[$j] = ${ar[i]} + ${ar[j]} = ${ar[i] + ar[j]}")
                count++
            }
        }
    }
    return count
}