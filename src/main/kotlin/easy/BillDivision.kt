package easy

/*
* The function accepts following parameters:
*  1. INTEGER_ARRAY bill
*  2. INTEGER k
*  3. INTEGER b
*/

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    val actualAmount = (bill.sum() - bill[k]) / 2

    if (b > actualAmount) {
        println(b - actualAmount)
    } else {
        println("Bon Appetit")
    }
}

fun main(args: Array<String>) {
    bonAppetit(arrayOf(3, 10, 2, 9), 1, 7)
}