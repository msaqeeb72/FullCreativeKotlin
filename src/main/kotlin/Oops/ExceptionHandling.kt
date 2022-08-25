package Oops

fun main() {
    var num = 5

    try {
        num=num/0
    }catch (e:Exception){
        println(e)
        println("Can't divide by Zero")
    }finally {
        println("This block always going to execute")
    }
    val password = "123"

    if(password.length < 6 )
        throw PasswordErrorException("Password is short")


}

class PasswordErrorException(msg:String): Exception(msg ) {
    init {
        println(msg)
    }
}