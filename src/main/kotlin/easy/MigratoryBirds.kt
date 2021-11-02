package easy

fun main(){
    migratoryBirds(arrayOf(1,4,4,4,5,3))
}

fun migratoryBirds(arr: Array<Int>): Int {
    val migratoryRate = HashMap<Int,Int>()
    arr.forEach {
        migratoryRate.merge(it, 1, Integer::sum)
    }

    val maxMigratory = migratoryRate.maxByOrNull { it.value }!!
    return maxMigratory.key
}