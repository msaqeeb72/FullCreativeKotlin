package ContactsApp

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class PhoneTest {
    @Test
    fun whenPhoneIsEmpty(){
        assertEquals(false, validPhone(""))
    }
    @Test
    fun whenPhoneLessThan10(){
        assertEquals(false, validPhone("703013330"))
    }
    @Test
    fun whenPhoneMoreThan10(){
        assertEquals(false, validPhone("70301333057"))
    }
    @Test
    fun whenPhoneIsValid(){
        assertEquals(true, validPhone("7030133305"))
    }
}