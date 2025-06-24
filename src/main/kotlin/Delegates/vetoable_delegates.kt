package Delegates

import kotlin.properties.Delegates
fun main() {
    var age: Int by Delegates.vetoable(0) { _, old, new ->
        new >= 0  // Allow only non-negative ages
    }
    age = 25
    age = -5
    print(age)
}
