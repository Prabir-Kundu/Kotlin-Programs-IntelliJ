package BasicProgram

/*fun fibonacci(n: Int): Int {
    return if (n == 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
}

fun BasicProgram.main() {
    val count = 10 // Number of Fibonacci numbers
    val fibonacciSeries = List(count) {
        println(it)
        fibonacci(it)
    }
    println("Fibonacci Series: $fibonacciSeries")
}*/

fun fibonmaciSeries(num:Int):Int{
    return if(num == 0) 0
    else if(num == 1) 1
    else fibonmaciSeries(num -1) + fibonmaciSeries(num - 2)
}
fun main() {
    println("Enter any number: ")
    var count = readln().toInt();
    var series = List(count){
        fibonmaciSeries(it)
    }
    println(series)
}

