import java.lang.Exception
import kotlin.random.Random

class NegativeRadiusException : Exception("Radius cannot be negative")

class Circle(private val radius: Double) : Shape("Circle") {
    // Error since primary and secondary constructors have same no.of parameters
//    constructor(diameter: Double): this(diameter/ 2)

    /**
     * Companion object
     * Can be called without creating an instance of the class
     * e.g: val circle = Circle.randomCircle() instead of val circle = Circle() (Check below)
     */
    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0);
            return Circle(radius)
        }
    }

    init {
        if (radius < 0) {
            throw NegativeRadiusException()
        }
        println("$name with radius $radius")
        println("$name Area from init: ${area()}");
        println("$name Parameter from init: ${perimeter()}")
    }


    // override => implementing area() from abstract class
    override fun area() = radius * radius * ImportantNumbers.PI

    override fun perimeter() = 2 * ImportantNumbers.PI * radius

    // need instance to be called
    fun randomCircle(): Circle {
        val radius = Random.nextDouble(1.0, 10.0);
        return Circle(radius)
    }
}