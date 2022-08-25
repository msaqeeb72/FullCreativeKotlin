fun main() {
    println(addition(2,3))
    println(addition(2,3,10))
    println(addition(3.0,5.2))
}
// function with same name but different in
// return type
// parameter type
// parameter count

fun addition(a:Int,b:Int) = a+b
fun addition(a:Int,b:Int,c:Int) = a+b+c
fun addition(a:Double,b:Double) = a+b