package BANKAPP;
import java.util.Scanner;
import java.sql.*;
public class Bank {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/bankapp";
	String user="root";
	String pass="Root";
	Connection con=null;
	Scanner sc=null;
	String query1,query2;
	int amount=0,number1=0,number2=0;
	PreparedStatement pstmt1,pstmt2;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,user,pass);
		display(con);
		query1="update bank set balance =balance-? where b_id=?";
		query2="update bank set balance =balance+? where b_id=?";
		con.setAutoCommit(false);
		pstmt1= con.prepareStatement(query1);
		pstmt2= con.prepareStatement(query2);
		System.out.println("enter the amount to be transferd");
		sc=new Scanner(System.in);
		amount=sc.nextInt();
		pstmt1.setInt(1, amount);
		pstmt2.setInt(1, amount);
		System.out.println("enter the account number sender");
		number1=sc.nextInt();
		pstmt1.setInt(2, number1);		
		System.out.println("enter the account number receiver");
		number2=sc.nextInt();
		pstmt2.setInt(2, number2);
		pstmt1.executeUpdate();
		pstmt2.executeUpdate();
		con.commit();
		System.out.println("money transfer ✅ to account number "+number1+" to "+number2);
		display(con);
	}catch (Exception e) {
		try {
			System.out.println("money not transfer ❌ to account number "+number1+" to "+number2);
			con.rollback();
			display(con);
		}catch (Exception e1) {
			System.out.println();
		}
		e.printStackTrace();
	}
}
public static void display(Connection con) throws Exception {
	Statement stmt=con.createStatement();
	String query="select * from bank";
	ResultSet rs= stmt.executeQuery(query);
	System.out.println("______________");
	System.out.println(" id | name | balance");
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(3));
	}
	System.out.println("______________");
	System.out.println();
}
}
