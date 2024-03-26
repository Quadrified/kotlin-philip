import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    println("Please enter a number: ")
    val input = try {
        readlnOrNull()?.toInt()
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("Finally block")
    }
    println("You entered $input")
}

class DivisionByZeroException : Exception("Cannot divide by zero. Please try a different number")

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw DivisionByZeroException()
    }
    return a / b
}

