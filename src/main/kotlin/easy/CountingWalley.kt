package easy

fun countingValleys(steps: Int, path: String): Int {
    var currentLevel = 0
    var result = 0
    path.chars().forEach {
        val step = it.toChar()
        if (step == 'D' && currentLevel == 0) {
            result++
        }
        if(step == 'D') currentLevel-- else currentLevel++
    }
    return result
}

fun main(args: Array<String>) {
    val result = countingValleys(8, "UDDDUDUU")

    println(result)
}

