package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CabDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public List<User> showUser() throws 
	ClassNotFoundException, SQLException {
    List<User> userList = new ArrayList<User>();
    connection = ConnectionHelper.getConnection();
    String cmd = "select * from userdetails";
    pst = connection.prepareStatement(cmd);
    ResultSet rs = pst.executeQuery();
    User user = null;
    while(rs.next()) {
    user = new User();
    user.setUserid(rs.getInt("userid"));
    user.setUsername(rs.getString("username"));
    user.setPassCode(rs.getString("passcode"));
    user.setFirstname(rs.getString("firstname"));
    user.setLastname(rs.getString("lastname"));
    user.setCity(rs.getString("city"));
    user.setState(rs.getString("state"));
    user.setMobile(rs.getString("mobile"));
    user.setEmail(rs.getString("email"));
    userList.add(user);
    }
    return userList;
   }

	public User searchUser(int userid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from userdetails where userid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, userid);
		ResultSet rs = pst.executeQuery();
		User user = null;
		if(rs.next()) {
			user = new User();
			user.setUserid(rs.getInt("userid"));
			user.setUsername(rs.getString("username"));
			user.setPassCode(rs.getString("passcode"));
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setCity(rs.getString("city"));
			user.setState(rs.getString("city"));
			user.setState(rs.getString("state"));
			user.setMobile(rs.getString("mobile"));
			user.setEmail(rs.getString("email"));
			
		}
		return user;
	}	
	public Driver searchDriver(int driverId) throws ClassNotFoundException, SQLException{
		 connection = ConnectionHelper.getConnection();
		 String cmd ="select * from driverdetails where driverId=?";
		 pst = connection.prepareStatement(cmd);
		 pst.setInt(1, driverId);
		 ResultSet rs = pst.executeQuery();
		 Driver driver = null;
		 if(rs.next()){
			 driver = new Driver();
				driver.setDriverId(rs.getInt("driverId"));
				driver.setDriverUserName(rs.getString("driverUserName"));
				driver.setDriverPassword(rs.getString("driverPassword"));
				driver.setDriverFirstName(rs.getString("driverFirstName"));
				driver.setDriverLastName(rs.getString("driverLastName"));
				driver.setDriverCity(rs.getString("driverCity"));
				driver.setDriverState(rs.getString("driverState"));
				driver.setDriverMobile(rs.getString("driverMobile"));
				driver.setDriverEmail(rs.getString("driverEmail"));
				driver.setCabType(rs.getString("cabType"));
		 }
		return driver;
	}
	public List<Driver> showDriver() throws ClassNotFoundException, SQLException{
		List<Driver>  driverlist = new ArrayList<Driver>();
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from driverdetails";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Driver driver = null;
		while(rs.next())
		{
			driver = new Driver();
			driver.setDriverId(rs.getInt("driverId"));
			driver.setDriverUserName(rs.getString("driverUserName"));
			driver.setDriverPassword(rs.getString("driverPassword"));
			driver.setDriverFirstName(rs.getString("driverFirstName"));
			driver.setDriverLastName(rs.getString("driverLastName"));
			driver.setDriverCity(rs.getString("driverCity"));
			driver.setDriverState(rs.getString("driverState"));
			driver.setDriverMobile(rs.getString("driverMobile"));
			driver.setDriverEmail(rs.getString("driverEmail"));
			driver.setCabType(rs.getString("cabType"));
			driverlist.add(driver);
		}
		return driverlist;
		
	}

	public String addBooking(Booking book)
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Booking(bookingDate,driverId,userId,startingLocation,endingLocation,kilometers,bookingStatus,billAmount) "
				+ " values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setDate(1, book.getBookingDate());
		pst.setInt(2, book.getDriverId());
		pst.setInt(3, book.getUserId());
		pst.setString(4, book.getStartingLocation());
		pst.setString(5, book.getEndingLocation());
		pst.setDouble(6, book.getKilometers());
	    pst.setString(7, book.getBookingStatus().toString());
		pst.setDouble(8,book.getBillAmount());
	
		pst.executeUpdate();
		return "Booked...";
	}

	
}
	


