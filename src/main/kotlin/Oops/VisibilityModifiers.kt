package Oops
//kotlin has 4 visibility modifiers
//1)  public      - Anywhere
//2)  private     - Inside same Class
//3)  Internal    - Inside Same Module
//4)  Protected   - Inside same and subclasses
fun main() {
    val obj = VisibilityModifiers()
    println(obj.id) //
   // println(obj.password) //cannot access private
   // println(obj.social) // cannot access social
    println(obj.email)

}
open class VisibilityModifiers(){
    public val id = "String"
    private val password = "abc123ab"
    protected val social = "Media"
    internal val email = "abc@xyz.com"


}

