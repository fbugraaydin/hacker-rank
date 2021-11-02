package easy

fun main() {
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
}

fun plusMinus(arr: Array<Int>) {
    var positive = 0;
    var negative = 0;
    var zero = 0;

    arr.forEach {
        if (it > 0) {
            positive += 1
        } else if (it < 0) {
            negative += 1
        } else {
            zero += 1
        }
    }

    print((positive.toDouble() / arr.size).toString())
    print((negative.toDouble() / arr.size).toString())
    print((zero.toDouble() / arr.size).toString())

}

private fun print(number: String) {
    println(number.padEnd(number.split(".")[0].length + 1 + 6, '0').substring(0, number.split(".")[0].length + 1 + 6))
}