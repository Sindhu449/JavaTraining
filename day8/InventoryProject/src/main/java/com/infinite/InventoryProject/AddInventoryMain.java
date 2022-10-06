package com.infinite.InventoryProject;

import java.sql.SQLException;
import java.util.Scanner;

public class AddInventoryMain {
	
	public static void main(String[] args) {
		InventoryDAO dao = new InventoryDAO();
		Inventory inventory = new Inventory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stock Id  ");
		inventory.setStockid(sc.next());
		System.out.println("Enter ItemName ");
		inventory.setItemName(sc.next());
		System.out.println("Enter Price ");
		inventory.setPrice(sc.nextDouble());
		System.out.println("Enter QuantityAvail  ");
		inventory.setQuantityAvail(sc.nextInt());

				try {
					System.out.println(dao.addInventory(inventory));
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
