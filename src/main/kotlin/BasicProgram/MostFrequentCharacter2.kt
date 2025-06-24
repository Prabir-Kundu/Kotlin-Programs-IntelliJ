package BasicProgram

import kotlin.collections.iterator
import kotlin.text.iterator

fun main() {
    print("Enter a string: ")
    val input = readLine() ?: ""

    if (input.isEmpty()) {
        println("Empty string. No characters to analyze.")
        return
    }

    val frequencyMap = mutableMapOf<Char, Int>()

    for (char in input) {
        if (!char.isWhitespace()) { // ignoring spaces
            frequencyMap[char] = frequencyMap.getOrDefault(char, 0) + 1
        }
    }

    val maxFrequency = frequencyMap.values.maxOrNull()

    if (maxFrequency != null) {
        val mostFrequentChars = frequencyMap.filter { it.value == maxFrequency }

        println("Character(s) with the highest frequency:")
        for ((char, freq) in mostFrequentChars) {
            println("Character '$char' occurred $freq times")
        }
    } else {
        println("No valid characters found.")
    }
}
