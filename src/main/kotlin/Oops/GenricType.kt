package Oops

fun main() {
        var name: Company<String> = Company("Full Creative")
        //var rank: Company = Company(12)
        var rank: Company<Int> = Company(12)
}
class Company<T> (input: T) {
    var x = input
    init{
        println(x)
    }
}