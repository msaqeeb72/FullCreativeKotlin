package AdvKotlin

fun main() {
    MyClass.fn()
    MyClass.A1.fn()
    MyClass.AntherObject.gn()

}

class MyClass(){
    companion object A1{
        fun fn(){
            println("Hello, I am from object")
        }
    }
    object AntherObject{
        fun gn(){
            println("Hello, I am from Another object")
        }
    }
}