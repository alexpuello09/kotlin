fun main() {
    val id: StudentId = StudentId(11)
    val idTeacher: TeacherId = TeacherId(9)
    id.verifyIdRange()
    idTeacher.verifyIdRange()
}

@JvmInline
value class StudentId(private val id: Int) {
    fun verifyIdRange() {
        if (id in 1..10) {
            println("The provided id exists within the valid range")
        } else {
            println("The provided id is out of the valid range")
        }
    }
}

@JvmInline
value class TeacherId(private val id: Int) {
    fun verifyIdRange() {
        if (id in 1..10) {
            println("The provided id exists within the valid range")
        } else {
            println("The provided id is out of the valid range")
        }
    }
}



