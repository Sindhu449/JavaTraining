package infinite.jdbcDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployShowMain {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/infinite","root","india@123");
			System.out.println("connected...");
			String cmd = "select * from Employ";
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery(cmd);
			while(rs.next()){
				System.out.println("employ no " +rs.getInt("empno"));
				System.out.println("name "  +rs.getString("empno"));
				System.out.println("Department"  +rs.getString("dept"));
				System.out.println("Designation" +rs.getString("dept"));
				System.out.println("Basic" +rs.getString("basic"));
				System.out.println("-------------------------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
