package medium

import java.math.BigInteger


/**
 * Solution 1
 */
val mutableMap: MutableMap<BigInteger, BigInteger> = mutableMapOf();

fun extraLongFactorialsSolution1(n: Int): Unit {
    println(factorial(BigInteger.valueOf(n.toLong())))
}

fun factorial(n: BigInteger): BigInteger {
    if (n == BigInteger.valueOf(2)) return BigInteger.valueOf(2)

    val result = mutableMap.getOrElse(n) { n * factorial(n.subtract(BigInteger.valueOf(1)))}
    mutableMap.putIfAbsent(n, result)
    return result
}

/**
 * Solution 2
 */
fun extraLongFactorialsSolution2(n: Int): Unit {
    var result: BigInteger = BigInteger.valueOf(1);

    for (i in 1..n){
        result = result.multiply(BigInteger.valueOf(i.toLong()))
    }
    println(result)
}

fun main(args: Array<String>) {
    extraLongFactorialsSolution1(4)
    extraLongFactorialsSolution1(5)

    extraLongFactorialsSolution2(4)
    extraLongFactorialsSolution2(5)

}