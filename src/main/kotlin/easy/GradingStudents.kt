package easy

fun main() {
    gradingStudents(arrayOf(73,67,38,33))
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map {
        if (it < 38) it
        else {
            val mod = it.rem(5)
            if (5 - mod < 3) it + 5 - mod else it
        }
    }.toTypedArray()
}