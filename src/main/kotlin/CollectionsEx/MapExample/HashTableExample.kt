package CollectionsEx.MapExample

import java.util.Hashtable

fun main() {
    //constructors
    val hMap = Hashtable<String,Int>()
//    val hMap = Hashtable<String,Int>(25)
//    val hMap = Hashtable<String,Int>(25,0.9F)
    val hMap2 = Hashtable<String,Int>(mapOf("three" to 3,"four" to 4))


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

    val it = hMap2.elements()


    for((K,P) in hMap2)
        println("Key = $K, Value = $P")

}