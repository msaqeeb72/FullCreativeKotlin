fun main() {
    val bmw = Car("BMW","Diesel",500)
    val thar = Car("Thar", "Diesel",1000)
    println(bmw.drive())
    println(thar.drive())
    println(thar.applyBreaks())
    println(bmw.applyBreaks())

}
class Car(val name:String,val type:String, var run:Int){
    fun drive():String = "$name is driving"
    fun applyBreaks(): String = "$name is stopped"

}