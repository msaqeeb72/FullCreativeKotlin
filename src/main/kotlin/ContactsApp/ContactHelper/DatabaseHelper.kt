package ContactsApp.ContactHelper

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

class DatabaseHelper {
    companion object DBHelper{
        private lateinit var connection: Connection
        private lateinit var statement: Statement
        fun setUpDatabase(){
            connection = DriverManager.getConnection("jdbc:sqlite:contactsDB.db")
            statement = connection.createStatement()
        }
        fun executeQuery(sqlQuery:String){
            statement.execute(sqlQuery)
        }
        fun selectAllFromDB():ResultSet{
            return statement.executeQuery("select * from contacts")
        }
    }
}