package com.infinite.emp;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class EmployDAO {
	
	SessionFactory sessionFactory;
		
	public String addEmploy(Employ employ) {
		sessionFactory=SessionHelper.getConnection();
		Session session=sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		double salary= employ.getSalary();
		double hra=(0.02*salary);
		double da = ((0.0125)*salary);
		double ta = ((0.0095)*salary);
		double tax = ((0.023)*salary);
		double pf = ((0.023)*salary);
		double gross =(salary+hra+da+ta);
		double netPay = (gross-tax-pf);
		
		employ.setDa(da);
		employ.setTa(ta);
		employ.setTax(tax);
		employ.setPf(pf);
		employ.setNetPay(netPay);
		employ.setHra(hra);
		employ.setGross(gross);
		employ.setLeaveAvailable(16);
		Transaction tr=session.beginTransaction();
		session.save(employ);
		tr.commit();
		session.close();
		return "Employ added ";
		
	}
	public String applyLeave(LeaveTable leaveTable) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(LeaveTable.class);
		long sdate = leaveTable.getlEAVE_START_DATE().getTime();
		long edate = leaveTable.getlEAVE_END_DATE().getTime();
		
		long diff =  edate - sdate;
		long m = diff/(1000*24*60*60);
		int days=(int)m;
		days=days+1;
		
		leaveTable.setlEAVE_NO_OF_DAYS(days);
	
		int no = leaveTable.getlEAVE_NO_OF_DAYS();
		if(no > 3) {
			leaveTable.setlOSS_OF_PAY( no - 3 );
		}
		else {
			leaveTable.setlOSS_OF_PAY(0);
		}
		Transaction tr = session.beginTransaction();
		session.save(leaveTable);
		tr.commit();
		session.close();
		return "Leave Applieed successfully....";
		
	}
	//to search employ
	  public Employ searchemploy(int empno) {
	         sessionFactory = SessionHelper.getConnection();
	         Session session = sessionFactory.openSession();
	         
	         Criteria cr = session.createCriteria(Employ.class);
	         cr.add(Restrictions.eq("empno", empno));
	         List<Employ> employList = cr.list();
	         
	         return employList.get(0);
	     }
	     
	     public List<LeaveTable> searchleave(int empno) {
	         sessionFactory = SessionHelper.getConnection();
	         Session session = sessionFactory.openSession();
	         
	         Criteria cr = session.createCriteria(LeaveTable.class);
	         cr.add(Restrictions.eq("empno", empno));
	         List<LeaveTable> leaveList = cr.list();
	         
	         return leaveList;
	     }
	     
	     
	 	public int lEAVE_NO_OF_DAYS(Date lEAVE_START_DATE,Date lEAVE_END_DATE) {
			int days = 0;
	        
			 days=(int)((lEAVE_END_DATE.getTime()-lEAVE_START_DATE.getTime())/(1000*60*60*24));
			days++;
			return days;
		}
		public double lOSS_OF_PAY(int empno,int month) {
			LeaveTable leave=new LeaveTable();
			
			
			Employ employ =new Employ();
		       
	        employ= searchemploy(empno);
		double sal=	employ.getSalary();
		double s=sal/30.46,lpay = 0;
		long d;
			sessionFactory = SessionHelper.getConnection();
	  		Session session = sessionFactory.openSession(); 
	  		
			Query query=session.createQuery("select sum(lEAVE_NO_OF_DAYS) from"
					+ " LeaveTable where empno=:empno AND (MONTH(lEAVE_START_DATE)=:month AND "
					+ "MONTH(lEAVE_END_DATE)=:month)")
	  				.setParameter("empno", empno).setParameter("month",month);
			
			
			  
	  		List<Long> count=query.list();
	  	long x = (Long)count.get(0);
			if(x>=3) {
				d=x-3;
				lpay=d*s;
			}
			query = session.createQuery("from LeaveTable where empno=:empno AND (MONTH(lEAVE_START_DATE)=:month AND "
					+ "MONTH(lEAVE_END_DATE)=:month)")
					.setParameter("empno", empno).setParameter("month", month);
			List<LeaveTable> leaveList = query.list();
			LeaveTable lastRecord = leaveList.get(leaveList.size()-1);
			lastRecord.setlOSS_OF_PAY(lpay);
			Transaction tr = session.beginTransaction();
			session.update(lastRecord);
			tr.commit();
			return lpay;
			
		}

 
	//to convert date
	
	public Date convertDate(java.util.Date dt) {
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		return sqlDate;
		
	}
	
}
