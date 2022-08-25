package ContactsApp

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.*

class CreateTest {
    private val outContent = ByteArrayOutputStream()
    private val errContent = ByteArrayOutputStream()
    private val originalOut = System.out
    private val originalErr = System.err
    @Test
    fun whenAlreadyExist(){
        val contacts = LinkedList<Contact>(listOf(Contact("Saqeeb","Mohd","7030133305","msaqeeb72@gmail.com")));
        CreateHelper().whenAlreadyExists(contacts);
        assertEquals("Contact already exists!!",outContent.toString().trim())
    }
    @Test
    fun validCreate(){
        val contacts = LinkedList<Contact>(listOf(Contact("Saqeeb","Saleem","9988775544","msaqeeb72@gmail.com")));
        CreateHelper().whenAlreadyExists(contacts);
        assertEquals("Contact added successfully!!!",outContent.toString().trim())
    }
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
}