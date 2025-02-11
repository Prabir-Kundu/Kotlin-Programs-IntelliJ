
//Reverse a String
fun reverseString(input: String): String {
    return input.reversed()
}

//Check if a String is a Palindrome
fun isPalindrome(input: String): Boolean {
    return input.equals(input.reversed(), ignoreCase = true)
}

//Count the Number of Words in a String
fun countWords(input: String): Int {
    return input.trim().split("\\s+".toRegex()).size
}

//Find the Most Frequent Character in a String
fun mostFrequentChar(input: String): Char? {
    return input.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key
}


//Remove Duplicate Characters from a String
fun removeDuplicates(input: String): String {
    return input.toCharArray().distinct().joinToString("")
}


//Capitalize the First Letter of Each Word
fun capitalizeWords(input: String): String {
    return input.split(" ").joinToString(" ") { it.capitalize() }
}

//Count the Occurrences of a Character
fun countCharOccurrences(input: String, char: Char): Int {
    return input.count { it == char }
}

//Replace a Word in a Sentence

fun replaceWord(input: String, oldWord: String, newWord: String): String {
    return input.replace(oldWord, newWord, ignoreCase = true)
}

//Remove Whitespaces from a String
fun removeWhitespaces(input: String): String {
    return input.replace("\\s".toRegex(), "")
}

//Find Longest Word in a Sentence
fun longestWord(input: String): String {
    return input.split(" ").maxByOrNull { it.length } ?: ""
}



fun main(){

}