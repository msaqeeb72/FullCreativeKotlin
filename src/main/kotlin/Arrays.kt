fun main() {
    val arr1 = arrayOf("Mango","Banana","Apple")
    var arr2 = arrayOf<Int>(25,50,75)

    println("Empty array with size")
    var arr3 = IntArray(10)
    println(arr3[0]);
    arr3[1] = 20
    println(arr3.size)
    //With index
    println("With index")
    for ((i,e) in arr1.withIndex())
        println("$i - $e")

    //without index
    println("without index")
    for (i in arr1)
        println("$i")

    println("Fill method")
    arr3.fill(10)
    arr3.forEach { i-> print("$i ") }
    println()


    println("plus method")
    val arr4= arr2.plus(arr2)
    arr4.forEach { i-> print("$i ") }
    println()

    val arr5:Any = arrayOf(1,"String")

    // sum function
    println("\nSum of Array4 is ${arr4.sum()}")

    // revers an array
    arr4.reverse()
    arr4.forEach { i-> print("$i ") }
    println()

    println("shuffle method")
    arr1.shuffle()
    arr1.forEach { i-> print("$i ") }
    println()

    println("slice method")
   val list = arr1.slice(0 .. 1)
    list.forEach { i-> print("$i ") }
    println()





    //methods to get value from array
    println(arr1[0])
    println(arr1[1])
    println(arr1.set(1,"Pineapple"))
    println(arr1.get(1))

    // to print size of arra
    println(arr1.size)
}