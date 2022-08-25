fun main() {
    var gender : String? = null
    var isAdult : Boolean? = null
    var num :Int? = null

    if (gender != null) {
        gender.uppercase()
    }

    println(gender?.uppercase())



    gender?.let {
        println(gender)
        println(it)
    }

    // Elvis Operator

    val gender2:String = gender?: "NA"


    // Not Null Assert Operator
    val value:String = gender!!
    println(value)
}
