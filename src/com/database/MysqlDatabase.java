package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;


public class MysqlDatabase {


	public static void main (String[] args) throws ClassNotFoundException, SQLException
	{
		databaseHandling();
	}
	
	public static void databaseHandling() throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.jdbc.Driver");                                                                                                                                                                                                                                    

		//jdbc:mysql://ipaddress:portnumber/db_name,username,password

		String databaseurl = "jdbc:mysql://localhost:3306/selenium";
		String useranme= "root";
		String password= "selenium";

		//Make a connection to the Database using method.
		//Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3036/selenium,root,selenium");
		Connection connect = DriverManager.getConnection(databaseurl,useranme,password);

		// Create Query to the Database using the Statement Object.
		Statement state= connect.createStatement();

		//Send the query to database using execute query and store the results in the ResultSet object.
		ResultSet rs = state.executeQuery("select name from seleniumtable where id=1;");
		
		while(rs.next()){
			
			String re = rs.getString("name");
			System.out.println(re);
		}
		
		/*while (rs.next()) {
			String column1 = rs.getString(1);
			System.out.print(column1 +"  ");
			String name= rs.getString("name");
			System.out.print(name+"  ");
			String email = rs.getString("Email");
			System.out.print(email+"  ");
			
			System.out.println();
		}*/
		connect.close();
	}
}
