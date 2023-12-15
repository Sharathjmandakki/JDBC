package takingInput;

import java.sql.*;
import java.util.*;

public class Program5 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcproject";
		String user = "root";
		String pass = "Root";
		String query = "insert into employee values(?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number of rows");
			int rows = sc.nextInt();
			for (int i = 1; i <= rows; i++) {
				System.out.println("enter the id name and salary of employee");
				pstmt.setInt(1, sc.nextInt());
				pstmt.setString(2, sc.next());
				pstmt.setInt(3, sc.nextInt());
				pstmt.execute();
			}
			System.out.println(rows + " rows inserted to table employee ✅");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
