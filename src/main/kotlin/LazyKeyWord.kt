class LazyKeyWord {
    private val expensiveData: String by lazy{
        // Calculate the expensive data here (it will be executed only once)
        "Some expensive data"
    }

    fun printData() {
        println(expensiveData) // Accessing the property (will calculate its value the first time)
        println(expensiveData) // Subsequent accesses will use the cached value
    }
}

fun main(args: Array<String>){
    val lazy = LazyKeyWord()
    lazy.printData()
}
