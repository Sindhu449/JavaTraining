package com.infinite.InventoryProject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ShowInventoryMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		InventoryDAO dao = new InventoryDAO();
		try {
			List<Inventory> inventoryList = dao.showInventory();
			for (Inventory inventory : inventoryList) {
				System.out.println(inventory);
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
