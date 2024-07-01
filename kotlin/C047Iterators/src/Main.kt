fun main() {
    val zoo =  Zoo(listOf(Animal("Zebra"), Animal("Horse")))
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}

class Animal(val name: String)

class Zoo(val animals: List<Animal>)

operator fun Zoo.iterator(): Iterator<Animal> {
    return animals.iterator()
}
