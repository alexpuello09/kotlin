fun main() {
    val sumResult = calculate(4, 5, ::sum)

    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")
    val func = operation()
    println(func(2))
}

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int{
    return operation(a, b)
}

fun sum(x: Int, y:Int) = x + y

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x:Int) = x * x