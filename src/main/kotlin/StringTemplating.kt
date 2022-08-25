fun main() {
    val num = 2;
    for(i in 1..10) {
        println(num.toString() + " x " + i.toString() + " = " + (num * i).toString())
        println("$num x $i = ${num * i}")
        // both of the line generate same output
        // 1st one is typical conventional method
        // 2nd ond is easy string templating method
    }

}