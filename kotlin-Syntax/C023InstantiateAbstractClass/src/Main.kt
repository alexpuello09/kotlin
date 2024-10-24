fun main() {
    val objectAbstract = object: MyAbstractClass() {
        override fun printSomething() {
             println("Printing something on screem")
        }
        override fun sayHelloWorld() {
            println("Hello, World")
        }
    }

    val object2 = object : MyAbstractClass() {
        override fun printSomething() {
            println("printing something once more")
        }

        override fun sayHelloWorld() {
            println("Printing hello World for the second time")
        }
    }
    objectAbstract.sayHelloWorld()
    objectAbstract.printSomething()
    object2.printSomething()
    object2.sayHelloWorld()
}


abstract class MyAbstractClass {
    abstract fun printSomething()
    abstract fun sayHelloWorld()
}