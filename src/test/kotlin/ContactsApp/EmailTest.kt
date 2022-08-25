package ContactsApp

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class EmailTest{
    @Test
    fun whenEmailIsEmpty(){
        val email=""
        val result = validEmail(email)
        assertEquals(false,result)
    }
    @Test
    fun whenDontHaveAddTheRate(){
        val email="msaqeeb72gmail.com"
        val result = validEmail(email)
        assertEquals(false,result)
    }
    @Test
    fun whenDontHaveDot(){
        val email="msaqeeb72@gmailcom"
        val result = validEmail(email)
        assertEquals(false,result)
    }
    @Test
    fun whenDontHaveCom(){
        val email="msaqeeb72@gmail."
        val result = validEmail(email)
        assertEquals(false,result)
    }
    @Test
    fun whenValidEmail(){
        val email="msaqeeb72@gmail.com"
        val result = validEmail(email)
        assertEquals(true,result)
    }

    @BeforeEach
    internal fun setUp() {
        println("Tests are stated")
    }
}