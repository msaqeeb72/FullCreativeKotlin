package CollectionsEx.ListExample

import java.util.*

class StackExample {
}

fun main() {
    val s = Stack<Int>();
    s.push(5)
    s.push(6)
    s.push(1)
    s.push(6)

    s.add(11)

    println(s)

    s.pop()
    println(s)

    println(s.peek())


    println(s.empty())

    println(s.search(1))

}