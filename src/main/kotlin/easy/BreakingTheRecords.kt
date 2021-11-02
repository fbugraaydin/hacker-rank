package easy

fun main() {
    println(breakingRecords(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)).joinToString(" ") )
}

fun breakingRecords(scores: Array<Int>): Array<Int> {
    val worstScoreList = mutableListOf(scores.first())
    val highestScoreList = mutableListOf(scores.first())

    scores.forEach {
        if (it > highestScoreList.last())
            highestScoreList.add(it)
        if (it < worstScoreList.last())
            worstScoreList.add(it)
    }
    return arrayOf(highestScoreList.size - 1, worstScoreList.size - 1)
}