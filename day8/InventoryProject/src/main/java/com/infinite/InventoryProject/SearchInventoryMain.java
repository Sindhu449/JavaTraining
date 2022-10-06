package com.infinite.InventoryProject;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchInventoryMain {

	public static void main(String[] args) {
		String stockid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stockId  ");
		stockid = sc.next();
		InventoryDAO dao = new InventoryDAO();
		try {
			Inventory inventory = dao.searchStock(stockid);
			System.out.println(inventory);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}
