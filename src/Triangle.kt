import kotlin.math.sqrt

class Triangle(private val a: Double, private val b: Double, private val c: Double) : Shape("Triangle") {
    init {
        println("$name created with a=$a, b=$b, c=$c")
        println("$name Area: ${area()} ")
        println("$name Perimeter: ${perimeter()} ")
    }

    override fun area() =
        sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c));

    override fun perimeter() = a + b + c
}