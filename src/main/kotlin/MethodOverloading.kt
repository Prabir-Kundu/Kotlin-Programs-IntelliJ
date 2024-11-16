class Calculator {
    // Method to add two integers
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // Overloaded method to add three integers
    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    // Overloaded method to add two double values
    fun add(a: Double, b: Double): Double {
        return a + b
    }
}

fun main() {
    val calc = Calculator()
    println(calc.add(5, 10))            // Calls add(Int, Int)
    println(calc.add(5, 10, 15))        // Calls add(Int, Int, Int)
    println(calc.add(5.5, 10.5))        // Calls add(Double, Double)
}
