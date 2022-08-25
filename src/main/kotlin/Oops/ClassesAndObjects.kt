import Oops.VisibilityModifiers

fun main() {
    val emp = Employee("Saqeeb",22,"Male",20000)
    val emp2 = Employee()
    println(emp)

    emp2.insetValues("Sharma",25,"Male",36000)

    println(emp2)

    val dev = Employee.Developer()

    println(dev.innerFun())
    val obj = VisibilityModifiers()
    obj.email
}
class Employee(n:String="Name",a:Int=18,g:String="NA",s:Int=18000){
    var name:String = ""
    var age:Int = 0
    var gender:String = "Male"
    var salary:Int = 0
    init {
        name=n
        age=a
        gender=g
        salary=s
    }

    fun insetValues(n:String, a:Int, g:String, s:Int){
        name=n
        age=a
        gender=g
        salary=s
    }

    override fun toString(): String {
        return "$name - $age - $gender - $salary"
    }
    class Developer(){
        var str = "This is Developer Class"
        fun innerFun():String{
            return str;
        }
    }

}