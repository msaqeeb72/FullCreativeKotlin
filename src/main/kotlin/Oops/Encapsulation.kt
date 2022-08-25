package Oops

fun main() {
    val obj = Person()

    obj.getName()
    obj.incrementAge()
}

class Person(){
    private val name:String = "Saqib"
    private var age:Int = 10

    fun getName():String{
        println("name fetched by user")
        return name;
    }
    fun incrementAge(){
        println("Age increment by 1")
        age++;
    }

}