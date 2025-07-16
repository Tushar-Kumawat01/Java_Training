package jdbcdemo;

/**
* Author : Tushar.Kumawat
* Date   : Jul 15, 2025
* Time	 : 3:24:00 PM
* Email	 : Tushar.Kumawat@coforge.com
*/
import java.sql.*;
import java.util.Scanner;

public class Candidates {

	Connection con;
	PreparedStatement pstmt; // Accepts values at run time - pre compiled statements
	ResultSet rs;
	
	int cnt=0;
	String sqlUpdate;
	Scanner s;
	int eid;
	String lastname;
	
	public void getConnection() throws Exception
	{
		con=ConnectionUtil.createConnection();
	}
	
	public void UpdateCandidate() throws Exception
	{
		sqlUpdate="UPDATE candidates SET last_name = ? WHERE id = ?";
		
		pstmt=con.prepareStatement(sqlUpdate);
		
		// prepare data for update
		s=new Scanner(System.in);
		System.out.println("enter Employee id:");
		eid=s.nextInt();
		System.out.println("enter employee's new last name :");
		lastname=s.next();
				
		 // passing values to prepared statement using setter methods
		pstmt.setString(1, lastname);
		pstmt.setInt(2, eid);
		
		cnt=pstmt.executeUpdate();
		System.out.println(String.format("Row affected : %d", cnt));
		
		// reuse the prepared statement
        lastname = "Clinton";
        eid = 101;
        pstmt.setString(1, lastname);
        pstmt.setInt(2, eid);

        cnt = pstmt.executeUpdate();
        System.out.println(String.format("Row affected %d", cnt));
        con.close();
	}
}
