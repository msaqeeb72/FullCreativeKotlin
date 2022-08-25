package ContactsApp

import io.mockk.mockk
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.util.LinkedList


internal class DeleteTest{
    var list = ArrayList<Contact>()
    private val outContent = ByteArrayOutputStream()
    private val errContent = ByteArrayOutputStream()
    private val originalOut = System.out
    private val originalErr = System.err
    val contact:Contact = mockk()
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
    fun deleteWhenEmpty(){
        var contacts = LinkedList<Contact>();
        DeleteHelper().deleteContact(contacts,2,1)
        assertEquals("No Contacts to delete",outContent.toString())
    }

    @Test
    fun deleteWithInvalidPosition(){
        val contacts = LinkedList<Contact>(listOf(Contact("Saqeeb","Saleem","7030133305","abc@abc.com")));
        DeleteHelper().deleteContact(contacts, position = 5, option = 2)
        assertEquals("Please enter valid Position",outContent.toString().trim())
    }

}
