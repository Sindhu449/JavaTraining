package com.infinite.agent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExamInsertMain {
 
	public static void main(String[] args) {
		String name,city,Gender;
		int MaritalStatus;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter agent Id...");
		System.out.println("Enter agent name...");
		name = sc.next();
		System.out.println("Enter agent city...");
		city = sc.next();
		System.out.println("Enter Agent Gender...");
		Gender = sc.next();
		System.out.println("Enter MaritalStatus");
		MaritalStatus = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/exam","root","india@123");
			String cmd = "Insert into agent(name,city,Gender,MaritalStatus)" +
					" values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, name);
			pst.setString(2, city);
			pst.setString(3, Gender);
			pst.setInt(4, MaritalStatus);
			pst.executeUpdate();
			System.out.println("Agent data inserted successfully...");
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
