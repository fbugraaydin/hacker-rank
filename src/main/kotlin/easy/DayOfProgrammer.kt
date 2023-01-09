package easy

fun dayOfProgrammer(year: Int): String {
    if (year< 1700 || 2700 < year) {
        return ""
    }
    if (year == 1918) {
        return "13.09.1918"
    }

    if (isLeapYear(year)) {
        return "12.09.$year"
    }
    return "13.09.$year"
}

fun isLeapYear(year: Int): Boolean {
    if (year < 1918) {
        return year % 4 == 0
    }
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
}

fun main() {
    val result = dayOfProgrammer(1984)

    println(result)
}
