fun main() {
    val num = 10;

    var result  = num in 1+1..10 // Upper Bond Included

    println(result)

    result  = num in 1 until 10 // Upper Bond not included

    println(result)
}
/// how to remover lower bond?