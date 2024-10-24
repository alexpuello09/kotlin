class Pencil {
    fun penDown(): String {
        return "Pencil is down"
    }

    fun penUp(): String {
        return "Pencil is up"
    }

    fun turn(degrees: Double): String {
        return "Pencil turns $degrees degrees"
    }

    fun forward(pixels: Double): String {
        return "Pencil moves forward $pixels pixels"
    }
}

fun main() {
    val pencilObject  =  Pencil()
        with(pencilObject) {
            penDown()
            forward(100.0)
            turn(90.0)
            penUp()
        }
    println(pencilObject.penUp())
    println(pencilObject.penDown())
    println(pencilObject.forward(3.4))
    println(pencilObject.turn(10.2))
}
