package CollectionsEx.Cursor

class Iterator {
}

fun main() {
    var arrayInt:ArrayList<Int> = ArrayList()
    for (i in 1 until 10)
        arrayInt.add(i)

    var it = arrayInt.iterator()

    while (it.hasNext()){
        if (it.next() % 2 !=0)
            it.remove()
    }
    it=arrayInt.iterator()
    while (it.hasNext()){
        println(it.next())
    }

    println(it.javaClass.name)

}