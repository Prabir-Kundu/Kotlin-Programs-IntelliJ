package BasicProgram

fun main(){
    print("Enter any number to check is Prime number or not: ")
    val number = readln().toInt();
    var count = 0
    if (number == 0 || number == 1){
        print("$number is not prime number")
    } else {
        for (i in 2..number){
            if (number%i == 0){
                count++
            }
        }
    }

    if (count == 1){
        print("The number is prime number")
    } else {
        print("The number is not prime number")
    }
}