package CollectionsEx

import java.util.PriorityQueue

fun main() {
    val q = PriorityQueue<Int>()
    q.add(10);
    q.add(20);
    q.add(15);
    println(q)


    println(q.peek())

    q.poll()

    println( q.peek())

    q.add(5)
    q.add(7)
    q.offer(3)


    println(q)

}