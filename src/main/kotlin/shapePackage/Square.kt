package shapePackage

class Square(val length:Int):Shape("Square") {
    override fun area() {
        println("Area of Square is ${length.times(length)}")
    }
}