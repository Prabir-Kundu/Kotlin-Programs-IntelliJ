package PrintArrayReverse

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)

    // Using built-in function
    val reversedArray = arr.reversedArray()
    println(reversedArray.joinToString())

    // Using a loop
    for (i in arr.indices.reversed()) {
        print("${arr[i]} ")
    }
}
