package easy

import kotlin.math.absoluteValue

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val distance = (x - z).absoluteValue - (y - z).absoluteValue
    return if (distance == 0) "Mouse C" else if (distance > 0) "Cat B" else "Cat A"
}

fun main(args: Array<String>) {
    val result = catAndMouse(1, 3, 2)
    println(result)
}