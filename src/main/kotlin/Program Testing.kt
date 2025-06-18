

fun main() {

    println("Enter any number: ")
    var num = readln().toInt()
    println("The factriol is: "+factriol1(num))
}

fun factriol1(n:Int):Int{
    return if (n == 0 || n == 1) 1
    else n * factriol1(n - 1)
}
