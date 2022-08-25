package CollectionsEx.MapExample

fun main() {
    val linkedHMap = LinkedHashMap<String,String>(20);


    linkedHMap.putAll(mapOf("Name" to "Saqeeb","Mobile" to "7030133305"))
    linkedHMap.put("Role","Android Developer")

    println(linkedHMap)

    println("Name: ${linkedHMap.get("Name")}")

    println(linkedHMap.containsKey("Mobile"))

}