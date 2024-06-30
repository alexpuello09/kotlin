
fun main() {
    println("Sum of 2 and 4 is ${sum(2, 4)}")
    println("The multiplication of 3 and 5 is ${multiply(3, 5)} ")
    printSum(2, 3)
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun multiply(a: Int, b: Int) = a * b

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}