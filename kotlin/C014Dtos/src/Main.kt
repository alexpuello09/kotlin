fun main() {
    val customerObject = Customer("Alberto", "Custodio")
    val customerObject2 = customerObject.copy(name = "Rosanna")

    println(customerObject.name )
    println(customerObject.lastname)

    println()

    println(customerObject2.name)
    println(customerObject2.lastname)
    println()
    foo(a = 10)
}

data class Customer(val name: String, val lastname: String)


//function with default values as arguments.
fun foo(a: Int = 0, b: String = "someString") {
    println(a)
    println(b)
}