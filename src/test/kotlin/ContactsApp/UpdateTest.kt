package ContactsApp

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.*

class UpdateTest {
    private val outContent = ByteArrayOutputStream()
    private val errContent = ByteArrayOutputStream()
    private val originalOut = System.out
    private val originalErr = System.err

    @BeforeEach
    fun setUpStreams() {
        System.setOut(PrintStream(outContent))
        System.setErr(PrintStream(errContent))
    }

    @AfterEach
    fun restoreStreams() {
        System.setOut(originalOut)
        System.setErr(originalErr)
    }
    @Test
    fun updateWhenExist(){
        val contacts = LinkedList<Contact>(listOf(Contact("Saqeeb","Saleem","7030133305","abc@abc.com")));
        UpdateHelper().updateContact(contacts,0,Contact("Saqeeb","Saleem","7030133305","abc@abc.com"))
        assertEquals("Same Contact exists already",outContent.toString().trim())
    }
    @Test
    fun validUpdate(){
        val contacts = LinkedList<Contact>(listOf(Contact("Saqeeb","Saleem","7030133305","abc@abc.com")));
        UpdateHelper().updateContact(contacts,0,Contact("Aqueb","Mohammad","9178349683","abc@abc.com"))
        assertEquals("Contact updated successfully",outContent.toString().trim())
    }
}