fun main() {
    val a = 10
    val b = 20

    //Arithmetic Operator

    println(a.plus(b)) // addition
    println(a.minus(b)) // subtraction
    println(a.times(b)) // multiplication
    println(a.div(b)) // division

    //Relational Operator

    println("changed")
    println(12.compareTo(11)) // greater than
    println(a<b) // less than
    println(a<=b) // less than equal to
    println(a>=b) // greater than equal to
    println(a==b) // equal to
    println(a!=b) // not equal to

    // Logical Operator

    val c = true
    val d = false
    println(c.and(d)) // Logical AND C && D
    println(c.or(d)) // Logical OR
    println(c.not())   // Logical NOT

}