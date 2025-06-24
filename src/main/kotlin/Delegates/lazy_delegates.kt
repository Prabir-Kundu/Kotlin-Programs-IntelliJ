package Delegates

fun main() {
    val userName: String by lazy {
        println("Computing username...")
        "Prabir"
    }
    
    println(userName) // First time: computes + prints
    println(userName) // Second time: returns cached
}
