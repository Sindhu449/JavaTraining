package com.infinite.InventoryProject;

public class Inventory {

	private String stockid;
	private String itemName;
	private double price;
	private int quantityAvail;
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	@Override
	public String toString() {
		return "Inventory [stockid=" + stockid + ", itemName=" + itemName + ", price=" + price + ", quantityAvail="
				+ quantityAvail + "]";
	}
	public Inventory(String stockid, String itemName, double price, int quantityAvail) {
		super();
		this.stockid = stockid;
		this.itemName = itemName;
		this.price = price;
		this.quantityAvail = quantityAvail;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
