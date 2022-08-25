package AdvKotlin

fun main() {
    val emp = Employee()
    emp.name = "Saqeeb"
    emp.age = 22
    println("")
    var num:Int = 0
    var arr = arrayOf(1,2,3)
    arr.apply {
        set(0,5)
        this[0] = 50
    }
    emp.apply {
        name="Johm"
        age = 25
        num++
        println(num)

    }

    emp.let {   // We can get not null object in let
        println(it.name)
        println(it.age)

    }

    with(emp){
        name = "NoName"
        age = 23
    }

    emp.run {
    }
}

data class Employee(var name:String = "",var age:Int = 22)
