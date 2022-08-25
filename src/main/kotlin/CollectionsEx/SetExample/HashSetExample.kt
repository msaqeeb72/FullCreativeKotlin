package CollectionsEx.SetExample

fun main() {
    val hSet = HashSet<String>(); //Create empty set with default capacity 16
    val hSet2 = HashSet<Int>(100);
    val hSet3 = HashSet<String>(50,0.5F)
    val hSet4 = HashSet<Int>(listOf(5,45,86,9,45,5))


    hSet2.add(54)
    hSet2.add(78)
    hSet2.add(-1)

    for (i in 1 .. 10)
        hSet2.add(i)

    println(hSet2)

    for (i in 1 .. 10 step 2)
       println(hSet2.add(i))

    println(hSet2)

    val it = hSet2.iterator()

    while (it.hasNext()){
        println(it.next())
    }


    hSet.add("Saqeeb")
    hSet.add("Tayeeb")
    hSet.add("Full Creative")
    hSet.add("Android")

    println(hSet)

    hSet.forEach {
        println(it.hashCode())
    }

}