package CollectionsEx.MapExample

import java.util.WeakHashMap

class HashMapEx {
}

fun main() {
    //constructors
    val hMap = HashMap<String,Int>()
//    val hMap = HashMap<String,Int>(25)
//    val hMap = HashMap<String,Int>(25,0.9F)
    val hMap2 = HashMap<String,Int>(mapOf("three" to 3,"four" to 4))


    hMap.put("I",1)
    hMap.put("V",5)
    hMap.put("X",10)

    println(hMap)

    hMap2.putAll(hMap)
    println(hMap2)

    println(hMap.get("X"))

    println(hMap.containsValue(10))
    println(hMap.containsKey("one"))

    println(hMap.size)

    //Collection Views of Map

    println(hMap.keys)

    println(hMap.values)

    println(hMap.entries)

    val it = hMap2.iterator()

    while (it.hasNext()){
        println(it.next())
    }



}