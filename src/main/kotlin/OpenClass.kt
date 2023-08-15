open class Animal {
    open fun makeSound() {
        println("Some generic animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Woof!")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound() // Output: Woof!
}
