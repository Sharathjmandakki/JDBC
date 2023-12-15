package takingInput;
import java.sql.*;
import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcproject";
		String user = "root";
		String pass = "Root";
		String query = "delete from employee where name=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("enter name of employee");String name = sc.next();
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			System.out.println("employee is deleted ✅ ");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
