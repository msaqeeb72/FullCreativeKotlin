package ContactsApp

import java.util.LinkedList

class UpdateHelper {
    fun updateContact(contacts: LinkedList<Contact>, index: Int, newContact: Contact) {
        if (contacts.isEmpty()) {
            println("No Contacts found!!")
            return
        }

        // displayContacts(false)
        var contactNumber = index

//    val tempContact = contacts[contactNumber]
        if (!contacts.contains(newContact))
            try {
                contacts.set(contactNumber, newContact)
                println("Contact updated successfully")
            } catch (e: Exception) {
                println(e)
            }
        else {
            println("Same Contact exists already")
        }


    }
}