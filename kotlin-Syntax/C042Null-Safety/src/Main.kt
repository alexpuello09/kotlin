fun main() {
    var neverNull: String = "This can't be null"
    neverNull = null  //This will cause an error
    var nullable: String? = "You can keep a null here"
    nullable = null
    var inferredNonNull = "The compiler assumes non-null"
    inferredNonNull = null //This will cause an error
}