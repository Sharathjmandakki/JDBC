package JDBC_Learning;
import java.sql.*;
import java.util.Scanner;
public class Program3 {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/jdbcproject";
	String user="root";
	String pass="Root";
	String query="Insert into student values(3,'sharath'),(4,'mohan')";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("drivers loaded");
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("connection is established");
		Statement stmr=con.createStatement();
		stmr.execute(query);
		System.out.println("query is executed");
		}catch(Exception e) {
		e.printStackTrace();
	}
}
}
