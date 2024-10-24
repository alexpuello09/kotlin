fun main() {
    println(getStringLength("Alex"))
    println(getStringLengthOtherWay(7.3))
}

fun getStringLength(str: Any): Int? {
    if (str is String) {
        return str.length
    }
    return null
}

fun getStringLengthOtherWay(str: Any): Int? {
    if (str !is String) { return null }
    return str.length
}