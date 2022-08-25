package CollectionsEx.Cursor

import java.util.LinkedList

fun main() {
    var arrayInt:LinkedList<Int> = LinkedList()
    for (i in 1 until 6)
        arrayInt.add(i)

    var listIterator=arrayInt.listIterator();

    while (listIterator.hasNext()){
        println(listIterator.next())
    }
    println()


    println()
    while (listIterator.hasPrevious())
        println("${listIterator.previous()} index = ${listIterator.previousIndex() + 1}")

    println()
    println()

    println(arrayInt)
    listIterator = arrayInt.listIterator()
    while (listIterator.hasNext()){
        val temp = listIterator.next();
        if (temp == 3)
            listIterator.remove()
        if(temp == 5)
            listIterator.set(55)
        if(temp==2)
            listIterator.add(32)
    }

    println(arrayInt)
    println(listIterator.javaClass.name)

}