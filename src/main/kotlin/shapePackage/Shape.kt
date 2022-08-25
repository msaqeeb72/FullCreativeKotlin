package shapePackage

abstract class Shape(val name:String) {

    fun display(){
        println("${this.name} is displaying")
    }
    abstract fun area()


}