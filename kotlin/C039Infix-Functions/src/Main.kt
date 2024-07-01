fun main() {
    println(5 addAnotherNum 5)
}

infix fun Int.addAnotherNum(num: Int): Int = this + num