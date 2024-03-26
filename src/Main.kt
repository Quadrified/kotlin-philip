import kotlin.random.Random

fun main() {
    /**
     * Loops
     */
//    var numToCount = readlnOrNull()?.toInt();
//    while (numToCount != null && numToCount >= 0) {
//        println(numToCount)
//        numToCount--
//    }

//    for (i in 'a'..'z' step 24) {
//        println(i)
//    }

    /**
     * Arrays
     */

//    val myArray = arrayOf(1, 2, 3, 4, 5)
//    var max = 0;
//    for (i in myArray) {
//        max += i
//    }
//    val avg = max / myArray.size;
//    println("Sum: $max");
//    println("Avg: $avg");

    /**
     * Lists
     */

//    val list = mutableListOf(1, 2, 3)
//    list.add(4)
//    println(list)
//    list.remove(1)
//    println(list)
//    list.removeAt(2)
//    println(list)

    /**
     * Loops
     */

//    val list = mutableListOf<Int>()
//    for (i in 1..5) {
//        val x = readlnOrNull()?.toInt()
//        if (x != null) {
//            list.add(x)
//        }
//    }
//    println(list.reversed())

//    val x = readlnOrNull()?.toInt();
//    if (x != null) {
//        println(if (x % 2 == 0) "even" else "odd")
//    }

//    val age = readlnOrNull()?.toInt();
//    val x = 6;
//    // when only works with one variable
//    when (age) {
//        in 0..5 -> println("You're a young kid")
//        in 6..17 -> println("You're a teenager")
//        18 -> println("You're 18!!!")
//        19, 20 -> println("You're a young adult")
//        in 21..65 -> println("You're an adult")
//        66 -> if (x == 6) {
//            println("old")
//        }
//
//        else -> println("You're really old")
//    }

    /**
     * Functions
     */
//    greet();
//    printSum()
//    printPow(2, 5)
//    println(printPow(2, 5));
//    val res = printPow(4, 0)
//    println(res)

//    println(multiply(5, 90))

//    val list = listOf(1, 2, 3)
//    println(printFirstItem(list))

//    val list = listOf(1, 2, 3, 0, 7, 9, 8, 6, 4, 5);
//    println("Search for this number:")
//    val numToSearch = readlnOrNull()?.toInt();
//    if (numToSearch != null) {
//        findNumberAtPosition(list, numToSearch)
//    }

    /**
     * vararg => adding any number of variables as params to a function
     * similar to (...) in JS
     */
//    val array = intArrayOf(1, 10, 20)
//     inserting array in vararg
//    val max = getMax(1, 5, 39, 989, *array, 209)
//    println(max)

//    searchFor("omer")
//    searchFor("omer", "Bing")
    /**
     * Named params => explicitly writing name of the function param while passing value
     */

//    searchFor(searchEngine = "DuckDuckGo", search = "How to....")

    /**
     * Extension function => creating custom functions for Type variables
     */

//    println("Enter a number");
//    val input = readlnOrNull()?.toInt()
//    if (input != null) {
//        if (input.isPrime()) {
//            println("$input is a prime")
//        } else {
//            println("$input is not a prime")
//        }
//    }

    val listOfN = listOf(1, 2, 3, 4, 5);
//    println(listOfN.product())

    /**
     * Classes
     */
//    val myRect = Rectangle(10.0, 20.0)

//    println("Area: ${myRect.area()}");
//    println("isSquare: ${myRect.isSquare()}")

//    val myCircle = Circle(20.0);
//    println("Area: ${myCircle.area()}");
//    println("Parameter: ${myCircle.perimeter()}")
//    val myCircle2 = Circle(7.0)

//    val myTriangle = Triangle(2.0, 4.0, 6.0)

    /**
     * Inheritance
     */

//    val myNewCircle = Circle(12.0)
//    myNewCircle.changeName("Omer") // changeName(newName) => inherited from Shape class

//    println(myNewCircle.name)
//    Output:
//    I am a super class => Shape class constructor is called
//    Circle with radius 12.0 => Circle class init is called
//    Circle Area from init: 452.38934211692975 => Circle class area is called
//    Circle Parameter from init: 75.39822368615496 => Circle class perimeter is called
//    Omer => Main.kt println(myNewCircle.name) called

    /**
     * Visibility modifiers
     * public => default for all, accessible anywhere
     * private => only available within the file in which it is implemented
     * protected => available within class or subclass
     */

    /**
     * Abstract classes
     */
//    val shape = Shape("NoSpecificShape") // Error

    /**
     * Function overriding => same function name but different implementation
     */
//    val rectangle = Rectangle(10.0)
//    val circle = Circle(3.0)
//    val triangle = Triangle(6.0, 4.0, 5.0)
//
//    println("Max area of rectangle and circle is ${maxArea(rectangle, circle)}")
//    println("Max area of rectangle, circle, and triangle is ${maxArea(rectangle, circle, triangle)}")

    /**
     *Companion object
     */
//    val randomCircle = Circle.randomCircle();
//    val randomRectangle = Rectangle.randomRectangle();

    /**
     * Anonymous class => to create a temporary class instead of new class
     * If extending an abstract class we need to implement all members
     */
    val a = Random.nextDouble(1.0, 5.0)
    val b = Random.nextDouble(1.0, 5.0)
    val c = Random.nextDouble(1.0, 5.0)
    val d = Random.nextDouble(1.0, 5.0)
    val height = Random.nextDouble(1.0, 5.0)

    val parallelogram = object : Shape("Parallelogram", a, b, height) {

        init {
            println("Parallelogram created with a=$a, b=$b, and height=$height")
            println("$name Area is ${area()}")
            println("$name Perimeter is ${perimeter()}")
        }

        override fun area(): Double = a * height

        override fun perimeter(): Double = 2 * a + 2 * b

        fun isRectangle(): Boolean = height == b
    }
//    println("Is parallelogram a rectangle? ${parallelogram.isRectangle()}")

    val trapezium = object : Shape("Trapezium", a, b, c, d, height) {
        init {
            println("$name created with a=$a, b=$b, c=$c, d=$d and height=$height")
            println("$name Area is ${area()}")
            println("$name Perimeter is ${perimeter()}")
        }

        override fun area(): Double = (a + b) / 2 * height

        override fun perimeter(): Double = a + b + c + d
    }

//    println(divide(10.0, 0.0))

    /**
     * Lambda functions => passing functions to functions
     */

    var list = (1..20).toList()
//    println(list)

    list = list.filter { it > 10 }

//    println(list)

    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val trianlgle1 = Triangle(4.0, 4.0, 4.0)
    val trianlgle2 = Triangle(4.0, 3.0, 4.0)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0, 3.0)

    var shapes = listOf(
        circle1,
        circle2,
        trianlgle1,
        trianlgle2,
        rectangle1,
        rectangle2
    )

//    shapes = shapes.filter { it.area() > 20.0 }.sortedBy { it.area() }

    // Custom lambda function as extension function
    shapes = shapes.customFilter { it.area() > 20.0 }.sortedBy { it.area() }

    for (shape in shapes) {
        println("${shape.name}: Area = ${shape.area()}")
    }

    /**
     * Generics
     */
    val integers = (1..10).toList().customFilter { it > 5 }

    println(integers)

    val triple = Triple<Int, String, Boolean>(10, "Omer", true)

    val customTriple = CustomTriple<Int, String, Boolean>(10, "Quadri", false)
    customTriple.printTypes()

} // main ends

/**
 * Lambda function & Generics
 */

// format => List<Type>.functionName(fnName: (fnInput) -> (fnOutput)): List<Type>
fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T> {
// <T: Type> => to restrict type of generic
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (filterFunction(item)) {
            resultList.add(item)
        }
    }
    return resultList
}

/**
 * Function overriding => same function name but different implementation
 */
fun maxArea(shape1: Shape, shape2: Shape): Double {
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()

    return if (areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape): Double {
    val maxAreaShape1Shape2 = maxArea(shape1, shape2)

    val areaShape3 = shape3.area()

    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
}


// Extension function => extension to existing Primitive Data type functions
fun Int.isPrime(): Boolean {
// this -> input
    for (i in 2..<this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}

fun List<Int>.product(): Int {
    var res = 1
    for (i in this) {
        res *= i
    }
    return res
}

// Default params
fun searchFor(search: String, searchEngine: String = "Google") {
//    println("Searching for $search on $searchEngine")
}

// vararg
fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

//fun alternatingSum(list: List<Int>): Int {
//    for(i in 0 until list.size - 1){
//
//    }
//}

fun findNumberAtPosition(list: List<Int>, numToSearch: Int) {
    var pos = 0;
    if (numToSearch in list) {
        for (i in list) {
            if (list[i] == numToSearch) {
                pos = i
            }
        }
    } else {
        println("Number not in the list");
        return;
    }
    println("The position of $numToSearch in the list is $pos")

//    for (i in 0 until list.size - 1) {
//        if (list[i] == numToSearch) {
//            return i;
//        }
//    }
//    return -1

}

fun printFirstItem(list: List<Int>) = list[0];

fun multiply(a: Int, b: Int) = a * b

fun printPow(base: Int, exponent: Int): Int {
    var result = 1;
    for (i in 1..exponent) {
        result *= base
    }
//    println(result);
    return result;
}

fun printSum() {
    var result = 0;
    for (i in 1..5) {
        result += i
    }
    println(result)
}

fun greet() {
    println("Hello World")
}
