package easy

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    var i = (m % n) + s - 1
    if(i > n) i -= n
    if(i == 0)return n
    return i
}

fun main(args: Array<String>) {
    val result = saveThePrisoner(5, 2, 2)
    println(result)
}