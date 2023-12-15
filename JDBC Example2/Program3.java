package takingInput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcproject";
		String user = "root";
		String pass = "Root";
		String query = "Update employee set name=? where name=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the new name");
			pstmt.setString(1, sc.next());
			System.out.println("enter the name to updated");
			pstmt.setString(2, sc.next());
			pstmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
