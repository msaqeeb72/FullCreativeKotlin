fun main() {
    println(subtraction(a=10,b=5))
    println(subtraction(a=10))
}
// when we are dealing with large amount of parameters, named argument is very useful
fun subtraction(a:Int,b:Int = 5):Int{
    val c = a-b;
    return c;
}