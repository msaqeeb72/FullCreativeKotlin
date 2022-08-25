fun main() {
    println(add(5,10)) // arguments
    println(addInline(55,78))
    println(evenOrOdd(55))
    var fun_add = ::add
    println(fun_add(6,3))
    printString()
}

// Simple Functions
fun add(num1:Int , num2:Int):Int{ // parameters
    //parameter are of val type
    //we cannot change its value;
    return num1+num2
}

fun evenOrOdd(num:Int):String{
    return if(num%2==0) "even" else "odd"

}

// Inline Functions
fun addInline(num1:Int , num2:Int):Int = num1+num2
// we can remove return type as result addition of two integers is always an Integer
// Kotlin will take Int as default return type in this scenario
// usually default return type of function is unit in kotlin
// fun addInline(num1:Int , num2:Int): = num1+num2

// function with default arguments value value




fun printString(num1: Int = 2){
    // In this function if value is not passed in arguments kotlin assign
    // default value as 2 to num1
    for(i in 1..num1)
        println("Hello")
}


//lambda function