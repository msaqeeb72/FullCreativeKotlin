package Oops

fun main() {
    val wd = Developer("Gennady", 25, 10000)
    wd.android()
    val hR = HR("Praveen", 26,15000)
    hR.hr()
}
open class Employee( name: String,age: Int,salary : Int) {
    public val pb = "Public"
    protected val pr = "private"
    init {
        println("My name is $name, $age years old and earning $salary per month. ")
    }
}

class Developer( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun android() {
        println("I am android app developer")
        println(super.pr)

    }
}
class HR( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun hr() {
        println("I am iOS app developer")
        println()
    }
}
