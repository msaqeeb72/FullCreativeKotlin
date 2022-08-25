package Oops

class CircleE (val radius: Double){
    fun area(): Double{
        return Math.PI * radius * radius;
    }
    fun myNewFun():String{
        return "This is extension function = $this"
    }
}
fun String.myNewFun():String{
    return "This is extension function = $this"
}
fun main(){
    fun CircleE.perimeter(): Double{
        return 2*Math.PI*radius;
    }
    val newCircle = CircleE(2.5);
    println("Example of Extension fun is ".myNewFun())
    println("Area of the circle is ${newCircle.area()}")
    println("Perimeter of the circle is ${newCircle.perimeter()}")
}