package ContactsApp.ContactHelper

class Validator {
    companion object Validator{
        fun validEmail(email: String): Boolean {
            if (email.contains(Regex("^[A-Za-z0-9\\-_.]+@[a-zA-Z0-9]+[.][a-z]{2,3}\$"))) { //ab@ab

                return true
            }
            println("Invalid Email")
            println("Enter valid Email")
            return false

        }
        fun validPhone(phone: String): Boolean {
            if (phone.contains(Regex("^[0-9]{10}$"))) {
                return true;
            }
            println("Invalid Phone Number")
            println("Enter valid Email")
            return false;
        }
        fun validName(name: String): Boolean {
            if (name.trim().isEmpty()) {
                println("First Name is mandatory")
                println("Enter First Name")

                return false
            }

            if (name.length < 3) {
                println("Name must contain more than 3 characters.")
                println("Enter First Name")
                return false
            }
            return true
        }
        fun validIndex(contactNumber: Int, size: Int): Boolean {
            if (contactNumber - 1 in 0 until size)
                return true
            if (size > 1) {
                println("only one Contact found")
                println("Please enter 1 select")
            }

            println("Please enter valid Position")
            return false
        }
    }
}