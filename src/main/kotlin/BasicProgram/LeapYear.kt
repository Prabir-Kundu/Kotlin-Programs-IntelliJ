package BasicProgram

/**
 1) If a year is divisible by 400, then it is a leap year.
    For example, 2000 is divisible by 400, therefore, it is a leap year.
 2) If a year is not divisible by 400, but it is divisible by 100, then it is not a leap year.
    For example, 1900 is divisible by 100 but not 400. Therefore, it is not a leap year.
 3) If a year is not divisible by 400 and not divisible by 100, but it is divisible by 4, then it is a leap year.
    For example, 2012 is not divisible by 400 and not divisible by 100, but it is divisible by 4.
    Therefore, it is a leap year.
*/

fun main(){
    print("Enter a year: ")
    val year = readln().toInt();
    if(year%4 == 0){
        if (year%100 == 0){
            if (year%400 == 0){
                print("$year is leap year")
            } else {
                print("$year is not leap year")
            }
        } else {
            print("$year is leap year")
        }
    } else {
        print("$year is not leap year")
    }
}