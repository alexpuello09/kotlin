fun main() {
    val myRectangle = Rectangle().apply {
        length = 4
        breadth = 5
    }
    println(myRectangle.length)
    println(myRectangle.breadth)
}

class Rectangle() {
    var length: Int = 0
    var breadth: Int = 0
}