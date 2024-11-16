package BasicProgram

fun fibonacci(n: Int): Int {
    return if (n == 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    val count = 4 // Number of Fibonacci numbers
    val fibonacciSeries = List(count) { fibonacci(it) }
    println("Fibonacci Series: $fibonacciSeries")
}