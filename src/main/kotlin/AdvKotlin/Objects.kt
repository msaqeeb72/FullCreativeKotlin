package AdvKotlin

fun main() {
    emp.display()
    val emp2 = object : example{
        val name = "Bharathi "
        val role ="Sr. Android Developer"

        fun display() = println("${name} = ${role}")
        override fun print() {
            println("Interface in object")
        }
    }
    emp2.display();

}

object emp{
    val name = "Saqeeb"
    val role = "Android Developer"
    fun display() = println("$name = $role")
}
interface example{
    fun print()
}