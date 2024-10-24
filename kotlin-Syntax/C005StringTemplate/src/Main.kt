fun main() {
    var a = 1
    val s1 = "a is equal to $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is equal to $a"
    println(s2)
}