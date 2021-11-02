package easy

fun main() {
    miniMaxSum(arrayOf(793810624, 895642170, 685903712, 623789054, 468592370))
}

fun miniMaxSum(arr: Array<Int>) {
    val min = arr.minOrNull()!!
    val max = arr.maxOrNull()!!

    val minIndex = arr.indexOf(min)
    val maxIndex = arr.indexOf(max)

    var minSum:Long = 0
    arr.toMutableList().forEachIndexed { i, e ->
        if (i != maxIndex) {
            minSum += e
        }
    }

    var maxSum:Long = 0
    arr.toMutableList().forEachIndexed { i, e ->
        if (i != minIndex) {
            maxSum += e
        }
    }

    println("$minSum $maxSum")

}