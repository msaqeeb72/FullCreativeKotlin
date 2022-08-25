package Oops

fun main() {
    var arr = arrayOf<Vehicle>(Car(),Bike())
    for (obj in arr) {
        println(obj.tyres)
        obj.driving()
        s1()
        s1("Overloading")
    }

}
fun s1(s:String){
    println("Parameter")
}
fun s1(){
    println("without Parameter")
}

open class Vehicle{
    open var tyres = 4
    var name = ""
    open fun driving(){
        println("Vehicle is driving")
    }
}
class Car:Vehicle(){
    override fun driving() {
        println("Car is driving")
    }

}
class Bike:Vehicle(){
    override var tyres = 2
    override fun driving() {
        println("Bike is riding")
    }
}
