package takingInput;
import java.sql.*;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcproject";
		String user = "root";
		String pass = "Root";
		String query = "Select * from employee where name=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the primary key  column name ");
			String column = sc.next();
			pstmt.setString(1, column);			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
