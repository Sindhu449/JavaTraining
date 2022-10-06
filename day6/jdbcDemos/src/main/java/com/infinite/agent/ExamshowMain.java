package com.infinite.agent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExamshowMain {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/exam","root","india@123");
			System.out.println("connected...");
			String cmd = "select * from agent";
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery(cmd);
			while(rs.next()){
				System.out.println("Agent Id " +rs.getInt("agentId"));
				System.out.println("Agent Name " +rs.getString("name"));
				System.out.println("Agent City " +rs.getString("city"));
				System.out.println("Agent Gender"  +rs.getString("gender"));
				System.out.println("Agent Marital Status" +rs.getInt("maritalstatus"));
				System.out.println("Agent premium " +rs.getDouble("premium"));
				System.out.println("----------------------------------------");
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
