fun main() {
    print("Enter a string: ")
    val input = readLine() ?: ""

    if (input.isEmpty()) {
        println("Empty string. No characters to analyze.")
        return
    }

    val frequencyMap = mutableMapOf<Char, Int>()

    for (char in input) {
        if (!char.isWhitespace()) { // ignore spaces
            frequencyMap[char] = frequencyMap.getOrDefault(char, 0) + 1
        }/* else {
            print ("Ignoring whitespace character\n")
        }*/
    }

    val mostFrequent = frequencyMap.maxByOrNull { it.value }

    if (mostFrequent != null) {
        println("Most frequent character: '${mostFrequent.key}' occurred ${mostFrequent.value} times")
    } else {
        println("No valid characters found.")
    }
}