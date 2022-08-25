package CollectionsEx

fun main() {
    //We cannot change the value of immutable collections
    //listof, setof, mapof

    // list of returns same type which pass as generic type
    var fruits = listOf<String>("Apple","Banana","Mango")
    //fruits[0] = "Pineapple"
    fruits = listOf<String>("Pineapple","Banana","Mango")

    println(fruits)

    //set of only district values/ no duplication
    var ids = setOf<Int>(1102,1122,2212,1102,1122)
    println(ids)


    //values are stored in pain id - value.    value may be duplicate but id can't
    var nums = mapOf<Int,String>(0 to "Zero",1 to "One",2 to "two")
    println(nums)

}