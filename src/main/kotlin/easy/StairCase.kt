package easy

fun main(){
    staircase(6)
}

fun staircase(n: Int): Unit {
    for (i in 1..n){
        println(" ".repeat(n-i)+"#".repeat(i))
    }
}