fun main() {
    val numbers = listOf(1,5,8,-9,0,2)
    val firstNumber = numbers.first()
    val lastNumber = numbers.last()
    val firstNegativeNumber = numbers.first {it < 0}

    println(firstNumber)
    println(lastNumber)
    println(firstNegativeNumber)

    //if there is not element the functions first() and last() throw NoSuchElementException
}