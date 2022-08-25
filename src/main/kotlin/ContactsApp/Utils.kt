package ContactsApp

import java.util.LinkedList
import java.util.Scanner
import kotlin.system.exitProcess

class Utilities {
    companion object Utils{
        private val sc =Scanner(System.`in`)
        fun mainMenu(): Int {
            println()
            println()
            println("Welcome to Contacts Application")
            println("Press")
            println("1 to Create Contact")
            println("2 to Update Contact")
            println("3 to Delete Contact")
            println("4 to Display Contact")
            println("5 to exit")

            return Utilities.getUserInput().toInt();
        }

        fun mainMenuOrExit() {
            do {
                println("Press\n1 For Main menu\n2 For Exit")
                var op = Utilities.getUserInput().toInt()
                when (op) {
                    1 -> {}
                    2 -> {
                        exitProcess(0)
                    }
                    else -> println("Invalid Input!!")
                }
            } while (op != 1)
        }

        fun getUserInput():String{
            return sc.nextLine().toString()
        }

        fun getFiledToUpdate(tempContact:Contact): Int {

            println("Which Field you want to update")
            println("Press")
            println("1 For First Name ---> ${tempContact.fName}")
            println("2 For Last  Name ---> ${tempContact.lName}")
            println("3 For Phone      ---> ${tempContact.phone}")
            println("4 For Email      ---> ${tempContact.email}")
            println("5 For Save Changes")
            println("6 For Discard Changes")

            return Utilities.getUserInput().toInt()

        }

        fun isPhoneAlreadyExists(contacts: LinkedList<Contact>,newPhone:String):Boolean{
            contacts.forEach {
                if (it.phone == newPhone)
                    return true
            }
            return false
        }

    }
}