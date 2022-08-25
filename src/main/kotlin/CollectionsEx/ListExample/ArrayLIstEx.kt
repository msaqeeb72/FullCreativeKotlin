package CollectionsEx

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    //ArrayList Class -> Dynamic Array
    var arrayInt:ArrayList<Int> = ArrayList()  // Empty Array //default capacity = 10 // newCap = (Old * 3/2)+1
    //var array:ArrayList<String> = ArrayList(initialCapacity = 10) // With initial size
    var array = ArrayList<Any>(mutableListOf("One","Two","Three"))
    println(array)
    val strList = mutableListOf("Four","Five",12)
    //IF we have declared type as Any we can add element of any type
    array.add(12)

    // Add methods
    // 1-> it takes 1 parameter and add element to last of the list
    // 2-> it takes 2 parameters (int position, T value)

    arrayInt.add(10)

    arrayInt.add(0,20)
    println("After .add method $arrayInt")

    // .addAll method
    // it takes collection as a parameter and append it to arrayList
    // it also has an index parameter which specified starting position to insert
    array.addAll(strList)
    println("After .addAll method $array")


    // .get(int)
    // this method return element at specified position.
     println("use of .get()=> ${array.get(2)}")


    //set(int , T)
    //This method replace new specified value from old one from given position
    arrayInt.set(1,40)
    println("After .set method $arrayInt")

    //indexOf(T)
    //this method return index of given parameter(first occurrence)
    println("Using indexof method => ${array.indexOf("Three")}")

    //remove(element) // remove first occurrence of element in list
    //removeAt(index) // removes element from that position
    array.remove("One")
    array.removeAt(2)
    println("After removing elements from array : $array")

    //clear method
    //this method clear all data of list
    array.clear()
    println("After clearing list $array")

    //To Convert ArrayList to Synchronized
     val syList=Collections.synchronizedList(array)





}