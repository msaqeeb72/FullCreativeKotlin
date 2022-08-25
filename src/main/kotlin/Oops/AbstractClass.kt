package AdvKotlin

fun main() {
    val circle:Circle = Circle(4.0)
    println(circle.area())
    circle.display()

    val square:Square = Square(4.0)
    println(square.area())
    square.display()
}
class AbstractClass{}

abstract class Shape {
    var name:String = ""
    abstract fun area():Double
    abstract fun display()
    init {
        println("init called")
    }

}

class Circle( val radius:Double): Shape() {
    init {
        println("circle init")
    }
    override fun area(): Double {
        return Math.PI * radius * radius;
    }

    override fun display() {
        println("Circle is Displaying")
    }

}

class Square(val side:Double): Shape() {
    override fun area(): Double {
        return side*side
    }

    override fun display() {
        println("Square is Displaying")
    }

}