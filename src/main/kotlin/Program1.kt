fun main(){
    val list = listOf(1,2,3,4,5)
    val result = list.filter { it%2 == 0 }.map{it * 2}.sum()
    println(result)
}