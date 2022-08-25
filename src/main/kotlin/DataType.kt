fun main() {
    var i = 10
    i=20;
    println(i)
    var fl:Float = 3.5F // by default compiler assume 3.5 as Double, so that's why we used F
    lateinit var string:String;
    var j = "Hello Full"
    println(j.hashCode())
    j = "Hello Full Creative"  // cannot update val
    println(j)
    println(j.hashCode())
    j = "Hello Full"
    println(j.hashCode())
//    j= 10      // cannot change datatype once assigned

    println(j)
}