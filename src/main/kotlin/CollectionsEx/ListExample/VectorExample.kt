package CollectionsEx.ListExample

import java.util.Vector

class VectorExample {

}

fun main() {

    //constructors
    val v = Vector<Int>()
    val v2 = Vector<Int>(20)
    val v3 = Vector<String>(20,10)
    val v4 = Vector<String>(listOf("Google","Microsoft","Tesla"))

    v2.add(5)
    v2.addElement(25)
    println(v2.remove(5))
    println(v2.removeElement(5))
    println(v3.capacity())


    println(v2)

}