package BasicProgram
import java.util.Scanner
fun main() {
    println("Enter starting range: ")
    val start = readln().toInt()
    println("Enter ending range: ")
    val end = readln().toInt()
    var largestPrime = 0
    for(i in start..end){
        if(isPrime(i)){
            println("$i is a prime number")
            largestPrime = i
        }/* else {
            println("$i is not prime number")
        }*/
    }
    println("Three digit largest prime number: $largestPrime")
}

fun isPrime(num:Int):Boolean{
    var count = 0
    if (num == 0 || num == 1) {
        return false
    }
    for (i in 2.. num) {
        if (num % i == 0) {
            count++
        }
    }

    if (count == 1){
        return true
    } else {
        return false
    }
}