package JDBC_Learning;
import java.sql.*;
public class Program2 {
public static void main(String[] args) {
	String user="root";
	String pass="Root";
	String url="jdbc:mysql://localhost:3306/jdbcproject";
	String query="create table student(id int,name varchar(20))";
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Drivers loaded");
	Connection con=DriverManager.getConnection(url,user,pass);
	System.out.println("connection established");
	Statement stmt=con.createStatement();
	stmt.execute(query);
	System.out.println("query is executed");
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
