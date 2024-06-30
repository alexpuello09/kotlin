fun main() {
    Animal.describe()
    Animal.name = "cat"
    Animal.type = "ragdoll"

    println()
    println("After Updating")
    Animal.describe()
}

object Animal {
    var name: String = "dog"
    var type: String = "Golden Retriever"

    fun describe() {
        println("Hello I'm a $type $name")
    }
}
