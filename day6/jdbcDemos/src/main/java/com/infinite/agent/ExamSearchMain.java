package com.infinite.agent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExamSearchMain {

	public static void main(String[] args) {
		int agentId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent Id...");
		agentId =sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/exam","root","india@123");
			String cmd = "select * from agent where agentId=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, agentId);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				System.out.println("Agent Id " +rs.getInt("agentId"));
				System.out.println("Agent Name " +rs.getString("name"));
				System.out.println("Agent City " +rs.getString("city"));
				System.out.println("Agent Gender"  +rs.getString("gender"));
				System.out.println("Agent MaritalStatus" +rs.getInt("maritalstatus"));
				System.out.println("Agent premium " +rs.getDouble("premium"));
				System.out.println("----------------------------------------");
				System.out.println("***record not found***");
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
