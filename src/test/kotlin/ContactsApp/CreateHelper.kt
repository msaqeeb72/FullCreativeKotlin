package ContactsApp

import java.sql.SQLException
import java.util.LinkedList

class CreateHelper {
    fun whenAlreadyExists(contacts:LinkedList<Contact>){
       // println("Enter First Name")
        val fName = "Saqeeb"

        //println("Enter last Name")
        val lName = "Mohd"

//        println("Enter Phone Number")
        val phone = "7030133305"

//        println("Enter Email Address")
        val email = "msaqeeb72@gmail.com"


        val contact = Contact(fName, lName, phone, email)
        if (contacts.contains(contact))
            println("Contact already exists!!")
        else {
            try {
                contacts.add(contact)
                println("Contact added successfully!!!")
            }catch (e: SQLException){
                println(e.toString())
            }catch (e:Exception){
                println(e.toString())
            }

        }
    }
}