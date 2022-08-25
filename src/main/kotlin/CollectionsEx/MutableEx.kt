package CollectionsEx

fun main() {
    // in mutable you can change the values of the list, set and map;

    val muList = mutableListOf(54,78,61)
    println(muList)

    muList[0] = 55
    muList.set(1,89)

    println(muList)

    val muSet = mutableSetOf("Kotlin","Java","Python","Java")
    println(muSet)

    muSet.add("GoLang")
    println(muSet)

    val muMap = mutableMapOf("status" to "ok","status_code" to "200","Response" to "{response}")
    println(muMap)

    muMap["status_code"] = "201"
    println(muMap)
    muMap.put("Error", "No Error")
    println(muMap)
}