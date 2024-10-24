fun main() {
    val days = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    println(days)
    val daysWithCapitalT = days.filter { it.startsWith("T")}
    println(daysWithCapitalT)


    if ("Wednesday" !in days ) {
        println("Wednesday is not present in the list")
    } else {
        println("Wednesday is present in the list")
    }
}