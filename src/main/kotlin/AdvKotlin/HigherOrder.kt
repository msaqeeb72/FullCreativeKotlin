package AdvKotlin

fun main() {
    higherfunc(::add)
    println("Mul = ${higherfunc2()}")
}
fun add(a: Int, b: Int): Int{
    var sum = a + b
    return sum
}
fun higherfunc(addfunc:(Int,Int)-> Int){
    var result = addfunc(3,6)
    print("The sum of two numbers is: $result")
}
fun mul(a: Int, b: Int): Int{
    return a*b
}
fun higherfunc2() : ((Int,Int)-> Int){
    return ::mul
}