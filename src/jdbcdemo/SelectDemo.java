package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
* Author : Tushar.Kumawat
* Date   : Jul 15, 2025
* Time	 : 11:36:00 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

//for querying department table in coforgedb
public class SelectDemo {

	public static void main(String[] args) {
		
		Connection con =null;
		Statement stmt;
		ResultSet rs;
		
		try {
			//Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforgedb","root", "tusharsql");
			
			//create an statement object to Execute the query
			stmt = con.createStatement();
			rs= stmt.executeQuery("SELECT first_name,last_name,email,salary from employees order by last_name");
			
			//process the results
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
			}
			con.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}