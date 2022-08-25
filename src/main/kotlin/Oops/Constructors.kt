package Oops

fun main() {
    val obj1 = Constructors("BHW","Diesel",10,7)
    val obj2 = Constructors("nano","petrol")
}

class Constructors(name:String, type:String, tyre:Int, seating:Int){ // primary constructor
    val carName=name
    val carType=type
    val carTyres = tyre
    val carSeating = seating


    init {
        name.uppercase()
        println("Object Init")
    }
    constructor(name: String,type: String):this(name,type,4,5) // secondary constructor
}