fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = AsiaticLion("Leopoldo")
    lion.sayHello()
}



open class Dog {
    open fun sayHello() {
        println("Wof Wof")
    }
}

class Yorkshire: Dog() {
    override fun sayHello() {
        println("wif wif")
    }
}


//Inheritance with Parameterized Constructor
open class Tiger(val origin: String) {
    fun sayHello() {
        println("A Tiger from $origin Says: grrhhh!")
    }
}

class SiberianTiger: Tiger("Siberian")


//Passing Constructor Arguments to Superclass
open class Lion(val name: String, val origin: String){
    fun sayHello() {
        println("$name a lion from $origin Says: graoh!")
    }
}

class AsiaticLion(name: String): Lion(name = name, origin = "India")