

fun main() {
    val eagleInstance: Eagle = Eagle("Bald Eagle")
    val dogInstance: Dog = Dog("Golden Retriever")
    val catInstance: Cat = Cat("Maine Coon")
    println(describeAnimalType(eagleInstance))
    println(describeAnimalType(dogInstance))
    println(describeAnimalType(catInstance))
}


open class Animal

class Eagle(val type: String): Animal()
class Dog(val type: String): Animal()
class Cat(val type: String): Animal()

fun describeAnimalType(animal: Animal):String {
    return when (animal) {
        is Dog -> "The animal is a dog of type ${animal.type}"
        is Cat -> "The animal is a cat of type ${animal.type}"
        is Eagle -> "The animal is a eagle of type ${animal.type}"
        else -> { "Unknown animal type" }
    }
}