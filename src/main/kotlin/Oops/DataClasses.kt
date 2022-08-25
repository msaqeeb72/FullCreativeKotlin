package AdvKotlin

fun main() {
    val p1 = Person(1001,"Saqib")
    val p2 = Person(1001,"Saqib")

    val p3 = p1.copy()
    println(p3.name)
    val p4 = p2.copy(id = 2001)
    println(p4)
    println(p2==p1) // This shows false if we don't declare Person as data class

}
class DataClasses(){}

data class Person(val id:Int, val name:String)