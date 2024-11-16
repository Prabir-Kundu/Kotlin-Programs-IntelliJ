open class AnimalOverriding {
    // Method in the superclass
    open fun sound() {
        println("Animal makes a sound")
    }
}

class DogOverriding : AnimalOverriding() {
    // Overriding the sound method in the subclass
    override fun sound() {
        println("Dog barks")
    }
}

fun main() {
    val myAnimal = AnimalOverriding()
    myAnimal.sound() // Outputs: Animal makes a sound

    val myDog = DogOverriding()
    myDog.sound()    // Outputs: Dog barks

    // Polymorphism
    val myPet: AnimalOverriding = DogOverriding()
    myPet.sound()    // Outputs: Dog barks (demonstrates polymorphism)
}