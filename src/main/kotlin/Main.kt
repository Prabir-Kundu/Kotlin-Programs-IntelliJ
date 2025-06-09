/*fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}*/

fun factriol(num:Int):Int{
    return if(num == 0 || num == 1) 1
    else num * factriol(num - 1)
}
fun main() {
    println("Enter any number: ")
    var num = readln().toInt()
    println("The factriol is : "+factriol(num))
}
