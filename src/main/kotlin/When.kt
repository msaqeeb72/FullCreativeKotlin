fun main() {
    var animal = "Cat"
    // Kotlin does not support switch statement
    // Instead of writing If Else ladder we can use When statement
    // The When Statement reduce lines of code
    // as If we can use When as expression
    when(animal){
        "Cat","Cheetah" -> println("Cat Family")// , using comma we can put or condition
        "Dog" -> println("Dog is an Animal")
        "Goat" -> println("Goat is an Animal")
        else -> println("not Found")

    }

    //  When with range
    var num:Any = 50
    when(num){
        in 0..10 -> println("less than 10")
        in 11..50 ->println("more than 10")
    }
    //check type with when

    when(num){
        is Int -> println("Integer Value")
        is String -> println("String value")
    }


    // When as expression
    animal = "Horse"
    val result:String = when(animal){
        "Cat" -> {
            println("Hello Cat")
            "Cat is an Animal"
        }
        "Dog" -> "Dog is an Animal"
        "Goat" -> "Goat is an Animal"
        else -> "not Found"

    }
    println(result)
}