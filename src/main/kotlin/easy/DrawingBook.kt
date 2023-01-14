package easy

fun pageCount(n: Int, p: Int): Int {
    val lastPage = if (n % 2 == 0) n + 1 else n
    val firstPage = 1
    val desiredPage = if (p % 2 == 0) p + 1 else p

    if (desiredPage - firstPage  <= lastPage - desiredPage) {
        return (desiredPage - firstPage) / 2
    }
    return (lastPage - desiredPage) / 2
}

fun main(args: Array<String>) {
    val result = pageCount(5, 4)

    println(result)
}
