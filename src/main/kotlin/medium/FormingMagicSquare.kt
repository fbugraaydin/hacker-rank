package medium

import java.math.RoundingMode

fun formingMagicSquare(s: Array<IntArray>): Int {
    val sum = s.sumOf { it.sum() }
    val target = (sum / 3).toBigDecimal().setScale(1, RoundingMode.UP);

    for (z in 0..1){
        for (i in 0..2){
            var columnSum = 0
            for (k in 0..2){
                val i1 = s[i][k]
            }
        }
    }

    return 0
}

fun main(args: Array<String>) {

    val s = arrayOf(intArrayOf(4, 8, 2), intArrayOf(4, 5, 7), intArrayOf(6, 1, 6))

    val result = formingMagicSquare(s)

    println(result)
}