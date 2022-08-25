package ContactsApp.ContactHelper

import ContactsApp.Utilities

class Getter {
    companion object Getter{
        fun getEmailAddress(isUpdate: Boolean): String {
            println("Enter ${if (isUpdate)"new" else ""} Email Address")
            var email = Utilities.getUserInput()
            if (Validator.validEmail(email))
                return email
            email = getEmailAddress(isUpdate)
            return email

        }
        fun getPhoneNumber(isUpdate: Boolean): String {
            println("Enter ${if (isUpdate)"new" else ""} Phone")
            var phone = Utilities.getUserInput()
            if (Validator.validPhone(phone))
                return phone
            phone = getPhoneNumber(isUpdate)
            return phone
        }
        fun getLastName(isUpdate: Boolean): String {
            println("Enter ${if (isUpdate)"new" else ""} Last Name")
            var lName = Utilities.getUserInput()
            if (lName == null)
                lName = "";
            return lName

        }
        fun getFirstName(isUpdate:Boolean): String {
            println("Enter ${if (isUpdate)"new" else ""} First Name")
            var fName = Utilities.getUserInput()
            if (Validator.validName(fName))
                return fName
            else
                fName = getFirstName(isUpdate)

            return fName

        }
        fun getContactIndex(size: Int): Int {
            println("Enter Contact Position")
            var contactNumber = Utilities.getUserInput().toInt()
            if (Validator.validIndex(contactNumber, size))
                return --contactNumber
            contactNumber = getContactIndex(size)
            return contactNumber
        }
    }
}