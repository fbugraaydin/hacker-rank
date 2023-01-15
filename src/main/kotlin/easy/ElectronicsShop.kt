package easy

/*
 * Complete the getMoneySpent function below.
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {

    var buyingPower = -1
    keyboards.forEach { keyboard ->
        drives.forEach { driver ->
            val totalPrice = keyboard + driver
            if(totalPrice == b) return totalPrice
            if (totalPrice > buyingPower && totalPrice <= b) buyingPower = totalPrice
        }
    }
    return buyingPower
}

fun main(args: Array<String>) {
    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */
    val moneySpent = getMoneySpent(arrayOf(3, 1), arrayOf(5, 2, 8), 10)

    println(moneySpent)
}