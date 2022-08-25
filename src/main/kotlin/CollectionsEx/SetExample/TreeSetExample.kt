package CollectionsEx.SetExample

import java.util.TreeSet
import kotlin.math.truncate
import kotlin.random.Random

class TreeSetExample {

}

fun main() {
    val tree = TreeSet<Int>();
    val tree2 = TreeSet<Int>(MyComp()) //customized sorting order
    val tree2_2 = TreeSet<Int> { o1, o2 -> o2.compareTo(o1) } //customized sorting order
    val tree3 = TreeSet<Int>(setOf(5,8,4,9,1))
    val tree4 = TreeSet<String>(sortedSetOf("We","Are","Full","Creative"))

    for(i in 1..10){
        tree.add(Random.nextInt(0,100))
    }

    println(tree)

    //Methods of Sorted Set
    println(tree.first())

    println(tree.last())

    println(tree.headSet(50))

    println(tree.tailSet(50,true))

    println(tree.subSet(25,75))


    for(i in 1..10){
        tree2.add(Random.nextInt(0,100))
    }
    println("Customized sorting")
    println(tree2)

    for(i in 1..10){
        tree2_2.add(Random.nextInt(0,100))
    }
    println(tree2_2)
}
class MyComp:Comparator<Int>{
    override fun compare(o1: Int?, o2: Int?): Int {
        if (o1!! < o2!!)
            return 1
        else if (o1 > o2)
            return -1
        else return 0
    }

}