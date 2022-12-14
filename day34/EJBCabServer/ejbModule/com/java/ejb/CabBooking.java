package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(CabBookingRemote.class)
public class CabBooking implements CabBookingRemote {
	static CabDAO cdao;
	static {
		cdao = new CabDAO();
	}
    

    /**
     * Default constructor. 
     */
    public CabBooking() {
        // TODO Auto-generated constructor stub
  


}


	@Override
	public List<User> showUser() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cdao.showUser();
	}


	@Override
	public User searchUser(int userid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cdao.searchUser(userid);
	}


	@Override
	public List<Driver> showDriverBean() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cdao.showDriver();
	}


	@Override
	public Driver searchDriverBean(int driverId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cdao.searchDriver(driverId);
	}


	@Override
	public String addBooking(Booking booking) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cdao.addBooking(booking);
	}
	
}
