import java.util.Scanner

class Problem1 {
}

fun main() {
    val sc=Scanner(System.`in`)

    println("Enter Rows Count")
    val rowC = sc.next().toInt()

    println("Enter Columns Count")
    val colC = sc.next().toInt()

    var inputValues = IntArray(rowC*colC)

    println("Enter ${colC*rowC} values.")

    for (i in 0 until rowC*colC){
        val input = sc.next().toInt()
        inputValues.set(i, input)
    }

    inputValues.sort()

    val rowArray:Array<IntArray> =Array<IntArray>(rowC) { i -> inputValues }
    var index = 0
    for (i in 0 until rowC){
        var arr:IntArray = IntArray(colC)
        for (j in 0 until colC){
            arr.set(j,inputValues.get(index++))

        }
        rowArray.set(i,arr)
    }

    for (row in rowArray){
        row.forEach {
            print("$it ")
        }
        println()
    }


}

