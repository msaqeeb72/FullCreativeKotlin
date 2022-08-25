package shapePackage

fun main() {
    var array = arrayOf(Circle(5),Square(5),Rectangle(5,7))
    array.forEach {
        it.display()  //TODO remove the array
    }
    println()
    println()

    array.forEach {
        it.area()
        when(it){
            is Circle -> draw(it)
            is Rectangle -> draw(it)
            is Square -> draw(it)
        }
    }


}
fun draw(circle: Circle){
    println("Drawing circle having radius: ${circle.radius}");
}
fun draw(sq: Square){
    println("Drawing circle having length: ${sq.length}");
}
fun draw(sq: Rectangle){
    println("Drawing circle having length: ${sq.length}");
}
