package ContactsApp

data class Contact(var fName:String,var lName:String, var phone:String,var email:String ) {
    override fun toString(): String {
        return "$fName $lName         $phone           $email"
    }
}