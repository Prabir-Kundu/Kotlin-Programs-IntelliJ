package BasicProgram

fun main(){
    print("Enter a string to check if it is a palindrome: ")
    val input = readln().trim()
    val reversedInput = input.reversed()

    if (input.equals(reversedInput, ignoreCase = true)) {
        println("$input is a palindrome")
    } else {
        println("$input is not a palindrome")
    }
}