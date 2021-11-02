package easy

import kotlin.math.abs

fun main(args: Array<String>) {
    val array = arrayOf(
        arrayOf(6,6,7,-10,9,-3,8,9,-1),
        arrayOf(9,7,-10,6,4,1,6,1,1),
        arrayOf(-1,-2,4,-6,1,-4,-6,3,9),
        arrayOf(-8,7,6,-1,-6,-6,6,-7,2),
        arrayOf(-10,-4,9,1,-7,8,-5,3,-5),
        arrayOf(-8,-3,-4,2,-3,7,-5,1,-5),
        arrayOf(-2,-7,-4,8,3,-1,8,2,3),
        arrayOf(-3,4,6,-7,-7,-8,-3,9,-6),
        arrayOf(-2,0,5,4,4,4,-3,3,0)
    )

    println(diagonalDifference(array))

}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var first = 0
    var second = 0
    var columnIndex = arr.size-1

    for (i in 0..arr.size-1) {
        first += arr[i][i]
        second += arr[i][columnIndex]
        columnIndex--
    }

    return abs(first - second)

}