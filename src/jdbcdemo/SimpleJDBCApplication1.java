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
public class SimpleJDBCApplication1 {

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
			rs= stmt.executeQuery("SELECT department_name,location,budget from departments");
			
			//process the results
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			}
			con.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}