package Oops

fun main() {
    val nested = Outer.Inner() //no need to call constructor of Outer class
    val innerC = Outer().Inner2() // must have to call Outer constructor

    nested.test()
    innerC.test()
}
class Outer{
    val value="Outer Class"
    val i = 10
    // What - Class inside another class called nested class
    // When - when we know that inner class will never exist without outer, both of them going to work togather
    class Inner{
        fun test(){
            //println("We are in inner class $i") cannot access filed of outer class in nested class
            println("We are in inner class")
        }
    }
    // inner keyword allows nested class to access properties of outer class
    // when we're creating an object of inner class we must have to create Outer class object first
    inner class Inner2{
        fun test(){
            print("Value from outer class $value  $i")
        }
    }
}