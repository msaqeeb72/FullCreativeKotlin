package ContactsApp

import ContactsApp.ContactHelper.DatabaseHelper
import java.util.*
import kotlin.system.exitProcess


private val sc = Scanner(System.`in`)
private val contacts = LinkedList<Contact>();
fun main() {
    var option = 0
    //statement.executeUpdate("create table contacts (first_name string, last_name string,phone string,email string)")
    //statement.executeUpdate("insert into contacts values('Saqeeb Saleem','Mohd',7030133305,'abc@abc.co')")
    DatabaseHelper.setUpDatabase()
    val rs= DatabaseHelper.selectAllFromDB()
    while(rs.next())
    {
        contacts.add(Contact(
                                rs.getString("first_name"),
                                rs.getString("last_name"),
                                rs.getString("phone"),
                                rs.getString("email")))
    }

    do {
        option = Utilities.mainMenu()
        when (option) {
            1 -> CURD.createContact(contacts)
            2 -> CURD.updateContact(contacts)
            3 -> CURD.deleteContact(contacts)
            4 -> CURD.displayContacts(contacts,true)
            5 -> exitProcess(0)
            else -> println("Invalid Input!!")
        }

    } while (option != 5)
}





