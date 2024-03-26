// open  => to add for inheritance since all kotlin classes are not inheritable by default
/**
 * abstract => template to be implemented by subclasses:
 * subclasses have to implement each and every item labelled abstract
 */

abstract class Shape(
    var name: String
) {
    constructor(name: String, vararg dimensions: Double) : this(name)

    init {
        println("I am a super class")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
    }

}