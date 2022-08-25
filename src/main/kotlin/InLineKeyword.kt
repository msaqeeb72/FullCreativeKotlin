fun main() {
    timeCalculate {
        loop(10000000)
    }
}
inline fun timeCalculate(fn:()->Unit ){
    val start = System.currentTimeMillis()
    fn()
    val end= System.currentTimeMillis()
    println("${end-start} ms")

}
fun loop(n:Long){
    for (i in 0..n){
        //loop
    }
}