package JDBC_Learning;
import java.sql.*;
public class Program1 {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/jdbcproject";
	String username="root";
	String pass="Root";
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("drivers loaded");
	DriverManager.getConnection(url,username,pass);
	System.out.println("connection established");
	}catch(Exception e) {
		e.printStackTrace();
		
	}
}
}
