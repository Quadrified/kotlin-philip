import kotlin.random.Random

class Rectangle(
    private val a: Double, private val b: Double
) : Shape("Rectangle") {

    // secondary constructors
    // constructor overloading
    constructor(a: Double) : this(a, a)

    // this(a.toDouble(), b.toDouble()) => converting and passing exact variables to primary constructor
    // a, b  => refer to constructor(a: Int, b: Int)
    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    companion object {
        fun randomRectangle(): Rectangle {
            val sideA = Random.nextDouble(1.0, 5.0)
            val sideB = Random.nextDouble(1.0, 5.0)
            return Rectangle(sideA, sideB)
        }
    }


    init {
        println("$name created with a=$a, b=$b")
        println("$name Area: ${area()}")
        println("$name Perimeter: ${perimeter()}")
    }

    override fun area() = a * b;

    override fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b
}