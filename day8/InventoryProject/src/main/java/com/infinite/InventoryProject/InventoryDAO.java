package com.infinite.InventoryProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InventoryDAO {

	Connection connection;
	PreparedStatement pst;
	
	
	public String addInventory(Inventory inventory) throws SQLException, ClassNotFoundException{
		String stockid = generatestockid();
	    inventory.setStockid(stockid);
	    String cmd = "insert into Stock(stockid,ItemName,Price,QuantityAvail) values(?,?,?,?)";
	    connection = ConnectionHelper.getConnection();
	    pst = connection.prepareStatement(cmd);
		pst.setString(1, stockid);
		pst.setString(2, inventory.getStockid());
		pst.setDouble(3, inventory.getPrice());
		pst.setInt(4, inventory.getQuantityAvail());
		pst.executeUpdate();
		return "Inventory Added...";
	}
	public String generatestockid() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select max(stockid) stockId from stock "; 
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String stockId = rs.getString("stockId");
		int id = Integer.parseInt(stockId.substring(1));
		id++;
		String stockId1 = String.format("s%03d", id);
        return stockId1;
	}
		public Inventory searchStock(String stockid) throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Inventory.stock where stockId=? ";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, stockid );
		ResultSet rs = pst.executeQuery();
		Inventory inventory = null;
		if(rs.next()){
			inventory = new Inventory();
			inventory.setStockid(rs.getString("StockId"));
			inventory.setItemName(rs.getString("ItemName"));
			inventory.setPrice(rs.getDouble("Price"));
			inventory.setQuantityAvail(rs.getInt("QuantityAvail"));
			}
		return inventory;
	}
	
	public List<Inventory> showInventory() throws ClassNotFoundException, SQLException {
				
			List<Inventory> inventoryList = new ArrayList<Inventory>();
			connection = ConnectionHelper.getConnection();
			String cmd = "select * from inventory.stock ";
			pst = connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			Inventory inventory = null;
			while(rs.next()){
				inventory = new Inventory();
				inventory.setStockid(rs.getString("StockId"));
				inventory.setItemName(rs.getString("ItemName"));
				inventory.setPrice(rs.getDouble("Price"));
				inventory.setQuantityAvail(rs.getInt("QuantityAvail"));
				inventoryList.add(inventory);			}
			return inventoryList;
	}
}
