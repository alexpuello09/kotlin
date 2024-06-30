fun main() {
    var a: Int = 1
    var b: Int = 2
    println("before changing a was $a and b was $b")

    a = b.also { b = a }

    println("after changing a is $a and b is $b")
}