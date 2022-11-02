package com.infinite.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployDAO {
	SessionFactory sessionFactory;
	
	public Employ searchEmploy(int emp_Id) {
		sessionFactory = SessionHelper.getConnection();
  	    Session session=sessionFactory.openSession();  
		Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("EMP_ID",emp_Id);   
		List<Employ> employList = query.list();
		if (employList.size()==0) {
			return null;
		} 
		return employList.get(0);
	}
	
	public List<LeaveHistory> searchLeave(int emp_Id) {
		sessionFactory = SessionHelper.getConnection();
  	    Session session=sessionFactory.openSession();  
		Query query = session.getNamedQuery("searchLeave");
		query.setParameter("Manager_ID",emp_Id);   
		List<LeaveHistory> LeaveList = query.list();
		return LeaveList;
	}
	
	public List<Employ> showEmploy() {
		sessionFactory = SessionHelper.getConnection();
  	    Session session=sessionFactory.openSession();  
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		return employList;
	}
}
