fun main(){
    //1. Range-based loop
    for (i in 1..5) {
        println(i) // Output: 1 2 3 4 5
    }
    //2. Descending loop
    for (i in 5 downTo 1) {
        println(i) // Output: 5 4 3 2 1
    }
    //3. Step loop
    for (i in 1..10 step 2) {
        println(i) // Output: 1 3 5 7 9
    }
    //4. Loop through an array
    val arr = arrayOf("Kotlin", "Java", "Python")
    for (language in arr) {
        println(language) // Output: Kotlin Java Python
    }
    //5. Loop with index
    for ((index, value) in arr.withIndex()) {
        println("Index: $index, Value: $value") // Output: Index: 0, Value: Kotlin ...
    }
    //6. Nested loop
    for (i in 1..3) {
        for (j in 1..2) {
            println("i: $i, j: $j") // Output: i: 1, j: 1 ... i: 3, j: 2
        }
    }
    //7. Using 'until' to exclude the end value
    for (i in 1 until 5) {
        println(i) // Output: 1 2 3 4
    }
    //8. Using 'forEach' on a collection
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach { number ->
        println(number) // Output: 1 2 3 4 5
    }
    //9. Using 'forEachIndexed' to get index and value
    numbers.forEachIndexed { index, number ->
        println("Index: $index, Value: $number") // Output: Index: 0, Value: 1 ...
    }
    //10. Using 'repeat' to execute a block multiple times
    repeat(3) {
        println("This will be printed 3 times") // Output: This will be printed 3 times (3 times)
    }
    //11. Using 'while' loop
    var count = 1
    while (count <= 5) {
        println(count) // Output: 1 2 3 4 5
        count++
    }
    //12. Using 'do-while' loop
    var num = 1
    do {
        println(num) // Output: 1 2 3 4 5
        num++
    } while (num <= 5)
    //13. Using 'break' to exit a loop
    for (i in 1..10) {
        if (i == 5) break // Exit loop when i is 5
        println(i) // Output: 1 2 3 4
    }
    //14. Using 'continue' to skip an iteration
    for (i in 1..10) {
        if (i % 2 == 0) continue // Skip even numbers
        println(i) // Output: 1 3 5 7 9
    }
    //15. Using 'label' to break out of nested loops
    outerLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) break@outerLoop // Break out of the outer loop
            println("i: $i, j: $j") // Output: i: 1, j: 1 ... i: 2, j: 1
        }
    }
    //16. Using 'in' to check membership in a range
    val range = 1..10
    for (i in range) {
        if (i in 5..7) {
            println("$i is in the range 5 to 7") // Output: 5 is in the range 5 to 7 ...
        } else {
            println("$i is not in the range 5 to 7") // Output: 1 is not in the range 5 to 7 ...
        }
    }
    //17. Using 'is' to check type in a loop
    val mixedList: List<Any> = listOf(1, "Kotlin", 3.14, true)
    for (item in mixedList) {
        when (item) {
            is Int -> println("$item is an Integer") // Output: 1 is an Integer ...
            is String -> println("$item is a String") // Output: Kotlin is a String
            is Double -> println("$item is a Double") // Output: 3.14 is a Double
            is Boolean -> println("$item is a Boolean") // Output: true is a Boolean
            else -> println("Unknown type")
        }
    }
    //18. Using 'break' with a label
    labeledLoop@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 3 && j == 3) break@labeledLoop // Break out of the labeled loop
            println("i: $i, j: $j") // Output: i: 1, j: 1 ... i: 2, j: 2
        }
    }
    //19. Using 'continue' with a label
    labeledContinue@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 2) continue@labeledContinue // Skip the rest of the inner loop
            println("i: $i, j: $j") // Output: i: 1, j: 1 ... i: 2, j: 1
        }
    }
    //20. Using 'for' with a range and a condition
    for (i in 1..10) {
        if (i % 2 == 0) {
            println("$i is even") // Output: 2 is even ... 10 is even
        } else {
            println("$i is odd") // Output: 1 is odd ... 9 is odd
        }
    }
    //21. Using 'for' with a collection and a condition
    val fruits = listOf("Apple", "Banana", "Cherry", "Date")
    for (fruit in fruits) {
        if (fruit.startsWith("B")) {
            println("$fruit starts with B") // Output: Banana starts with B
        } else {
            println("$fruit does not start with B") // Output: Apple does not start with B ...
        }
    }
    //22. Using 'for' with a range and a step
    for (i in 1..20 step 3) {
        println(i) // Output: 1 4 7 10 13 16 19
    }
    //23. Using 'for' with a range and a downTo
    for (i in 10 downTo 1) {
        println(i) // Output: 10 9 8 7 6 5 4 3 2 1
    }
}