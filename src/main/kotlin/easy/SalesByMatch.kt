package easy

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val sockColors = mutableMapOf<Int, Int>()
    ar.forEach {
        val count = sockColors.getOrPut(it) { 0 };
        sockColors.computeIfPresent(it) { _, _ -> count + 1 }
    }

    var result = 0
    sockColors.forEach { key, count ->
        val pairs = count / 2
        result += pairs
    }
    return result
}

fun main(args: Array<String>) {
    val result = sockMerchant(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))
    println(result)
}