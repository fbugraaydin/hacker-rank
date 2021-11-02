package easy

fun main(){
    countApplesAndOranges(7,10,4,12, arrayOf(2,3,-4), arrayOf(3,-2,-4))
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    println(apples.filter { it + a in s..t  }.count())
    println(oranges.filter { it + b in s..t }.count())
}