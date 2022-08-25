package AdvKotlin

import java.util.regex.Pattern

class SealedClass {
}

fun main() {
    val gender = Gender.MALE;
    println(gender.formattedOutput())
    println(gender)

    val red:Card = Red("Diamond",7)
    val card:Card = Blue("Star",5)
    when(red){
        is Blue -> println("Blue")
        is Red -> println("Red")
    }
}

enum class Gender(){
    MALE,
    FEMALE,
    OTHER;

    fun formattedOutput():String{
        return "Hello $this"
    }
}
sealed class Card()
class Red(val pattern: String,val num:Int):Card()
class Blue(val pattern: String,val num: Int):Card()