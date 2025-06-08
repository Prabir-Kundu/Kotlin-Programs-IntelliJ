package BasicProgram

fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
}

fun main() {
    print("Enter any to calculate factorial number: ")
    val count = readln().toInt()
    val factorial = factorial(count)
    println("Factorial Series: $factorial")
}