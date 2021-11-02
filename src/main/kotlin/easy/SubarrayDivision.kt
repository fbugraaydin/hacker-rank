package easy

fun main() {
    println(birthday(arrayOf(2, 2, 1, 3, 2), 4, 2))
    println(birthday(arrayOf(1, 2, 1, 3, 2), 3, 2))
    println(birthday(arrayOf(1,1,1,1,1,1), 3, 2))
    println(birthday(arrayOf(4), 4, 1))
}

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var result = 0

    s.forEachIndexed { index, e ->
        var days = e
        if(index + m <= s.size){
            for (i in index + 1 until index + m) {
                days += s[i]
            }
            if (days == d)
                result++
        }
    }
    return result
}