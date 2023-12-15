package takingInput;

import java.sql.*;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcproject";
		String user = "root";
		String pass = "Root";
		String query = "Insert into employee value(?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstmt = con.prepareStatement(query);		
			System.out.println("enter the id name and salary of employee");
			Scanner sc=new Scanner(System.in);
			pstmt.setInt(1,sc.nextInt());
			pstmt.setString(2,sc.next());
			pstmt.setInt(3,sc.nextInt());
			pstmt.execute();
			System.out.println("employee is inserted ✅");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
