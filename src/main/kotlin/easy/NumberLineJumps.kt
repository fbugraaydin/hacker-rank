package easy

import kotlin.math.floor


fun main() {
    println(kangaroo(45,7,56,2))
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    val jump = ((x1 - x2).toDouble() / (v2 - v1).toDouble())
    return if(jump >= 0 && jump == floor(jump)) "YES" else "NO"
}