package testng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	
	



   public class Jdbcconnection {
       public static void main(String[] args) throws ClassNotFoundException {
    	   String query = "select * from emp;";

           try {
               // Load the MySQL JDBC driver (necessary for older versions of Java)
             //  Class.forName("com.mysql.cj.jdbc.Driver");

               // Establish the connection
               Connection conn = DriverManager.getConnection("jdbc:mysql:///employee","root","Gayathri@98");
               PreparedStatement preparedStatement = conn.prepareStatement(query);
               ResultSet resultSet = preparedStatement.executeQuery();
               while(resultSet.next()){
                   System.out.println(resultSet.getInt(1)+" "+ resultSet.getString(2)
                   +" "+ resultSet.getInt(3)+" "+ resultSet.getDouble(4));
               }
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
   }
            

