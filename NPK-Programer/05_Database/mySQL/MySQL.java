package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//URL:
// JDBC DRIVER (jdbc) se se poveze na MYSQL(mysql) na URL naslov (192.0.0.1) v bazo podatkov (employees)



public class MySQL {

	public static void main(String[] args)  {
		
		Connection povezava;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://192.168.2.2:3306/employees";
			povezava = DriverManager.getConnection(url, "npk", "npkgeslo");
			
			stmt = povezava.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM employees LIMIT 500");
			
			while(rs.next() ) {
				System.out.println(rs.getInt(1)+ " "+ rs.getString(2) +" " + rs.getString(3)+" "+rs.getString(4) );
	
			} 
			
			povezava.close();  
					
			
		} catch (Exception e) {
			System.out.println("Prislo je do napake: " + e.toString());
		}
				

	}

}