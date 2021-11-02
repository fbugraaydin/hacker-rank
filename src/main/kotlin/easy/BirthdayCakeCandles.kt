package easy

fun main(){

}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val max = candles.maxOrNull()!!
    return candles.filter { it==max }.size
}
