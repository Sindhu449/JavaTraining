package com.infinite.JdbcRealTime1;

import java.sql.SQLException;
import java.util.List;

public class EmployshowAllMain {

	public static void main(String[] args) {
		EmployDAO dao = new EmployDAO();
		try {
			List<Employ> employList = dao.showEmploy();
			for (Employ employ : employList) {
				System.out.println(employ);
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
