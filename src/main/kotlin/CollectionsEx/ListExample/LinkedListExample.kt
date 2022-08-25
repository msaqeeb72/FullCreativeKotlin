package CollectionsEx.ListExample

import java.util.LinkedList

fun main() {
    val l = LinkedList<String>()
    val l2=LinkedList<Int>(mutableListOf(1,2,3,4))
    l.add("Are")

    println("L1 size = ${l.size}")
    println("L2 size = ${l2.size}")

    //LinkedList has 6 Special methods
    l.addFirst("We") // add Element to first position

    l.addLast("Full Creative") //add element at last

    println(l2.first) //return first element

    println(l2.last) //return last element

    l2.removeFirst()
    l2.removeLast()

    println(l[2])
    println(l)
    println(l2)




}