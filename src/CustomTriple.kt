class CustomTriple<A : Any, B : Any, C : Any>(
    private val first: A,
    private val second: B,
    private val third: C,
) {
    fun printTypes() {
        // first::class => gives class type for variable
        println("The type of first is ${first::class}")
        println("The type of second is ${second::class}")
        println("The type of third is ${third::class}")
    }
}