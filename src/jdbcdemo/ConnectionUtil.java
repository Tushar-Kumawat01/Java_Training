package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
* Author : Tushar.Kumawat
* Date   : Jul 15, 2025
* Time	 : 2:34:11 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class ConnectionUtil {

	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","tusharsql");
		return con;
	}
}
