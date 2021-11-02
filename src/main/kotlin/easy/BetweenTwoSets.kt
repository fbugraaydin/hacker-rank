package easy

fun main() {
    getTotalX(listOf(2,4), listOf(16,32,96))
}

fun getTotalX(a: List<Int>, b: List<Int>):Int {
    var leastNumber = a[0]
    for (i in 1 until a.size){
        leastNumber = findLeastCommonNumber(leastNumber,a[i])
    }

    var greatestDivisor = b[0]
    for (i in 1 until b.size){
        greatestDivisor = findGreatestCommonDivisor(greatestDivisor,b[i])
    }

    var temp = 0
    var count = 0
    while(temp <= greatestDivisor){
        temp += leastNumber
        if(greatestDivisor.rem(temp) == 0){
            count++
        }
    }
    return count
}

fun findGreatestCommonDivisor(a: Int, b: Int): Int {
    if (b == 0)
        return a
    return findGreatestCommonDivisor(b, a.rem(b))
}

fun findLeastCommonNumber(a: Int, b: Int): Int {
    return (a * b) / findGreatestCommonDivisor(a, b)
}