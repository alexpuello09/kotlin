fun main() {
    println(describeType(true))
}

fun describeType(obj: Any): String =
    when (obj) {
    is Int     -> "the value is an int value"
    is String  -> "the value is a string value"
    is Boolean -> "the value is a Boolean operator"
    is Double  ->  "the value is a Double value"
    is Float   ->   "the value is a Float value"
    else       -> "Unknown type of object"
}

