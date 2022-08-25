package CollectionsEx.SetExample

// hashSet                                LinkedHashSet
//no duplication                          no dublication
//insertion order not preserved           insertion order preserved

fun main() {
    val linkedSet = LinkedHashSet<String>(10);

    linkedSet.add("We")
    linkedSet.add("Are")
    linkedSet.add("Full")
    linkedSet.add("Creative")


    println(linkedSet)

}