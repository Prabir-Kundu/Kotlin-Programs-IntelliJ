/**
 * A higher-order function in Kotlin is a function that can take one or more functions as arguments and/or
 * return a function as its result. This means functions are treated as first-class citizens, just like any
 * other data types such as integers or strings.
* */

// A higher-order function that takes two integers and a function as arguments
fun mathOperation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

// Functions to be used as arguments in the mathOperation function
fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun main() {
    val resultAdd = mathOperation(5, 3, ::add) // Pass the 'add' function as an argument
    println("Addition Result: $resultAdd") // Output: Addition Result: 8

    val resultSubtract = mathOperation(10, 4, ::subtract) // Pass the 'subtract' function as an argument
    println("Subtraction Result: $resultSubtract") // Output: Subtraction Result: 6
}
