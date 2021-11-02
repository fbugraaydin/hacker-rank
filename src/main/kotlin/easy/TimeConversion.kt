package easy

fun main() {
    println(timeConversion("12:01:00AM"))
}

fun timeConversion(s: String): String {

    val hourParts = s.split(":")
    val hour = Math.floorMod(hourParts[0].toInt(), 12)
    val formattedHour = if (s.endsWith("AM")) {
        hour.toString().padStart(2, '0')
    } else {
        (hour + 12).toString()
    }
    val timeConverted = "$formattedHour:${hourParts[1]}:${hourParts[2]}"
    return timeConverted.substring(0, timeConverted.length - 2)
}