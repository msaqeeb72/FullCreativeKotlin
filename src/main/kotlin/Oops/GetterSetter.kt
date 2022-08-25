fun main() {
    var p1 = Person("saqeeb",22)
    var p2 = Person("Saqib",21)
    p2.age = -22
    //p1.age = 23
    println(p1.name)
    println(p2.age)
}
class GetterSetter{}
class Person(nameParam:String,ageParam:Int){

//    nameParam=nameParam. /// how to change parameter value of class
    val name= nameParam
    get() {
        return field.uppercase()
    }
    var age = ageParam
    set(value) {
        if(value>0)
            field=value
        else
            println("Age Can't be negative")
    }
}