fun main() {
    println("The longer number between 2 and 3  is ${maxOf(2 ,3)}")
    println("The difference between 4 and 5 is ${difference(4, 5)}")
}

fun maxOf(a: Int, b: Int): Int {
   if (a > b) {
       return a
   } else {
       return b
   }
}

fun difference(a: Int, b: Int) = if (a > b) a - b else b - a