fun main() {

    println(upperCase1("hola"))
    println(upperCase2("Salut"))
    println(upperCase3("HELLO"))
    println(upperCase5("HELLO"))
    println(upperCase6("HELLO"))
}


val upperCase1: (String) -> String = {str: String -> str.uppercase()}
val upperCase2: (String) -> String = { str -> str.uppercase() }
val upperCase3 = {str: String -> str.lowercase()}
val upperCase5: (String) -> String = { it.uppercase() }
val upperCase6: (String) -> String = String::uppercase