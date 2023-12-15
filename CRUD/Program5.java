package JDBC_Learning;

import java.sql.*;

public class Program5 {
public static void main(String[] args) {
	String user="root";
	String pass="Root";
	String url="jdbc:mysql://localhost:3306/jdbcproject";
	String query="delete from student where id = 3";

//	String query="update student set name='mohit' where id=2";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement stmt=con.createStatement();
		stmt.executeUpdate(query);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
