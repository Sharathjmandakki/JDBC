package JDBC_Learning;

import java.sql.*;

public class Program6 {
public static void main(String[] args) {
	String user="root";
	String pass="Root";
	String url="jdbc:mysql://localhost:3306/jdbcproject";
	String query="select * from student";

	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" || "+rs.getString(2));
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
