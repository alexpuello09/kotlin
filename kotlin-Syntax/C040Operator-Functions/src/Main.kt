fun main() {
    val point1 = Point(3, 5)
    val point2 = Point(1, 2)
    val result = point1 + point2
    println(result)

}

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(this.x + other.x, this.y + other.y)
}

