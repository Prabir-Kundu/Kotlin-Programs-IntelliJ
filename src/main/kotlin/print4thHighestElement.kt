//TODO: 4th largest element from array in kotlin:
//-------------------------------------------
fun main(args: Array<String>) {
    var number = intArrayOf(1, 2, 44, 3, 8, 66, 88) //1: 88, 2:66, 3:44
    print4thHighestElement(number)
}
fun print4thHighestElement(number: IntArray) {
    var firstNum = 0
    var secondNum = 0
    var thirdNum = 0
    var fourthHighest  = 0

    for (i in number) {
        if (firstNum < i) { //0<1
            fourthHighest = thirdNum
            thirdNum = secondNum
            secondNum = firstNum
            firstNum = i
        } else if (secondNum < i) {
            fourthHighest = thirdNum
            thirdNum = secondNum
            secondNum = i
        } else if (thirdNum < i) {
            fourthHighest = secondNum
            secondNum = thirdNum
            thirdNum = i
        }else if(fourthHighest<i){
            fourthHighest = i
        }
    }
    println("The fourth highest element is: $fourthHighest")
}