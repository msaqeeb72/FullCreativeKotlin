package shapePackage

class Rectangle(val length:Int,val height:Int):Shape("Rectangle") {
    override fun area() {
        println("Area of Rectangle is ${length.times(height)}")
    }

}