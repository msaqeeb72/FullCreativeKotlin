package shapePackage

 class Circle(var radius:Int):Shape("Circle") {
     constructor( radius: Int, name:String):this(radius){
         this.radius =radius
     }
    override fun area() {
        println("Area of Circle is ${(Math.PI * 2).times(radius)}")
    }

}