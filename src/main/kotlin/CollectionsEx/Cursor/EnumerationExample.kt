package CollectionsEx.Cursor

import java.util.*

class EnumerationExample {

}

fun main() {
    val vector = Vector<String>(listOf("Google","Microsoft","Tesla"))
    val e = vector.elements()

    // Enumeration Contain 2 methods

    while (e.hasMoreElements()){
        println(e.nextElement())
    }
}