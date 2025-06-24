package Delegates
import kotlin.properties.Delegates

fun main() {
    var counter: Int by Delegates.observable(0) { prop, old, new ->
        println("counter changed from $old to $new")
    }
    
    counter = 1  // prints: 0 to 1
    counter = 5  // prints: 1 to 5
}
