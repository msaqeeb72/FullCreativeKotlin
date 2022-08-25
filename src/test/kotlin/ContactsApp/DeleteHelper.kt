package ContactsApp

import java.util.LinkedList

class DeleteHelper {
    fun deleteContact(contacts:LinkedList<Contact>, position:Int,option:Int) {
        if (contacts.isEmpty()) {
            print("No Contacts to delete")
            return
        }
        if (contacts.size > 0) {
            when (option) {
                1 -> {
                    contacts.clear()
                    println("All contacts deleted successfully___")
                }
                2 -> {

                    //println("Which contact do you want to delete?")
                    //displayContacts(false)
                    var contactNumber = getContactIndex(position,contacts.size)
                    if (contactNumber==-1)
                        return
                    contacts.remove(contacts[contactNumber])
                    println("Contact removed successfully")
                }
                else -> println("Invalid Input!!!")
            }
        }

    }
    private fun getContactIndex(position: Int, size:Int): Int {
        var contactNumber = position
        if (validIndex(contactNumber, size))
            return contactNumber
        //contactNumber = getContactIndex()
        return -1
    }
}