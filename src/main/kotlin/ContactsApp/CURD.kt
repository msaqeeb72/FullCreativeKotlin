package ContactsApp

import ContactsApp.ContactHelper.DatabaseHelper
import ContactsApp.ContactHelper.Getter
import java.sql.SQLException
import java.util.*

class CURD {
    companion object Operation{
        fun createContact(contacts:LinkedList<Contact> ,) {
            println("Create Contact...")
            val fName = Getter.getFirstName(false)
            val lName = Getter.getLastName(false)
            val phone = Getter.getPhoneNumber(false)
            val email = Getter.getEmailAddress(false)
            val contact = Contact(fName, lName, phone, email)
            if (Utilities.isPhoneAlreadyExists(contacts, phone))
                println("Contact already exists!!")
            else {
                try {
                    DatabaseHelper.executeQuery("insert into contacts values('$fName','$lName','$phone','$email')")
                    contacts.add(contact)
                    println("Contact added successfully!!!")
                }catch (e: SQLException){
                    println(e.toString())
                }catch (e:Exception){
                    println(e.toString())
                }
            }
            Utilities.mainMenuOrExit()
        }
        fun updateContact(contacts: LinkedList<Contact>) {
            if (contacts.isEmpty()) {
                println("No Contacts found!!")
                Utilities.mainMenuOrExit()
                return
            }

            println("Which contact do you want to update?")
            displayContacts(contacts,false)
            var contactNumber = Getter.getContactIndex(contacts.size)
            val tempContact: Contact = Contact(
                contacts[contactNumber].fName,
                contacts[contactNumber].lName, contacts[contactNumber].phone,
                contacts[contactNumber].email
            )

            do {
                val op =Utilities.getFiledToUpdate(tempContact)
                when (op) {
                    1 -> tempContact.fName = Getter.getFirstName(true)
                    2 -> tempContact.lName = Getter.getLastName(true)
                    3 -> tempContact.phone = Getter.getPhoneNumber(true)
                    4 -> tempContact.email = Getter.getEmailAddress(true)
                    5 -> {
                        println(tempContact)
                        if (!Utilities.isPhoneAlreadyExists(contacts,tempContact.phone))
                            try{
                                DatabaseHelper.executeQuery("update contacts set first_name ='${tempContact.fName}', last_name ='${tempContact.lName}', phone = '${tempContact.phone}',email='${tempContact.email}'" +
                                        " where first_name ='${contacts[contactNumber].fName}'AND last_name ='${contacts[contactNumber].lName}'AND phone = '${contacts[contactNumber].phone}' AND email='${contacts[contactNumber].email}'")
                                contacts.set(contactNumber, tempContact)
                                println("Contact updated successfully")
                            }catch (e:Exception){
                                println(e)
                            }

                        else {
                            println("Same Contact exists already")
                            println("Cannot update Contact!!!")
                        }
                        Utilities.mainMenuOrExit()
                        break

                    }
                }
            } while (op != 6)

        }
        fun deleteContact(contacts: LinkedList<Contact>) {
            if (contacts.isEmpty()) {
                println("No Contacts to delete")
                Utilities.mainMenuOrExit()
                return
            }
            if (contacts.size > 0) {
                println("Press\n1 for delete all\n2 for delete selected")
                when (Utilities.getUserInput().toInt()) {
                    1 -> {
                        contacts.clear()
                        println("All contacts deleted successfully___")
                        DatabaseHelper.executeQuery("delete from contacts")
                        Utilities.mainMenuOrExit()
                    }
                    2 -> {

                        println("Which contact do you want to delete?")
                        displayContacts(contacts,false)
                        var contactNumber = Getter.getContactIndex( contacts.size);
                        DatabaseHelper.executeQuery("delete from contacts where first_name ='${contacts[contactNumber].fName}'AND last_name ='${contacts[contactNumber].lName}'AND phone = '${contacts[contactNumber].phone}' AND email='${contacts[contactNumber].email}'")
                        contacts.remove(contacts[contactNumber])
                        println("Contact removed successfully")
                        Utilities.mainMenuOrExit()
                    }
                    else -> println("Invalid Input!!!")
                }
            }

        }
        fun displayContacts(contacts: LinkedList<Contact>,showExit:Boolean) {
            if (contacts.isEmpty()) {
                println("No Contacts found")
                Utilities.mainMenuOrExit()
                return
            }
            for ((I, V) in contacts.withIndex()) {
                println("${I + 1} ---> $V")
            }
            if(showExit)
                Utilities.mainMenuOrExit()
        }
    }
}