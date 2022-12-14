package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;


public class UserShow {
	
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		   CabBookingRemote service = null;

		    // Context compEnv = (Context) new InitialContext().lookup("java:comp/env");

		    // service = (HelloService)new
		    // InitialContext().lookup("java:comp/env/ejb/HelloService");
		    service = (CabBookingRemote)
		    		new InitialContext().lookup("CabBooking/remote");

		    List<User> userList = service.showUser();
		    System.out.println(userList.size());
		    for (User user : userList) {
				System.out.println(user);
			}

	}

}