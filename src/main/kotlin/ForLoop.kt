fun main() {
    //Simple for loop using range
    for( i in 1..5) {
        println(i)
    }
    println()
    println()
    //Simple for loop using until and steps
    for (i in 1 until 10 step 2)
        println(i)

    println()

    // For with indices
    var arr = arrayOf("Full","Creative","Learning")
    for (i in arr.indices){
        println(arr[i])
    }
    println()

    //For loop in reverse
    for(i in 10 downTo 1 step 2)
        println(i)
}