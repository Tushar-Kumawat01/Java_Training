package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author : Tushar.Kumawat
* Date   : Jul 15, 2025
* Time	 : 2:32:17 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class SelectDemo2 {   

	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			
			con=ConnectionUtil.createConnection();
			
			stmt=con.createStatement();
			
			//projection
			rs=stmt.executeQuery("SELECT first_name,last_name,email from candidates order by last_name");
			
			while(rs.next())
			{
				System.out.print(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+
			rs.getString("email"));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
