package com.infinite.canteen;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class RestaurantDAO {
	
SessionFactory sessionFactory;
	
	public String addResturant(Restaurant resturant)
	{
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Restaurant.class);
		Transaction transaction = session.beginTransaction();
		String restId=idgenerate();
		resturant.setResturantId(restId);
		session.save(resturant);
		transaction.commit();
		session.close();
		return "resturant added";
	}
	
	public String idgenerate()
	{
		sessionFactory = SessionHelper.getConnection();
		 Session session = sessionFactory.openSession();
		 Criteria cr = session.createCriteria(Restaurant.class);
		 List<Restaurant> resturantList=cr.list();
		 if(resturantList.size()==0)
		 {
			 return "R001";
		 }else{
		 int id=Integer.parseInt(resturantList.get(resturantList.size()-1).getResturantId().substring(1));
		 String rid=String.format("R%03d", ++id);
		 return rid;}
	}
	public Restaurant SearchRestaurant(int resturant)
	{
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Restaurant.class);
		criteria.add(Restrictions.eq("resturant", resturant));
		List<Restaurant> resturantList = criteria.list();
		return resturantList.get(0);
	}
	
	public List<Restaurant> showRest() {
		sessionFactory = SessionHelper.getConnection();
  	    Session session=sessionFactory.openSession(); 
  	  Criteria criteria = session.createCriteria(Restaurant.class);
		List<Restaurant> restList = criteria.list();
     	return restList;
	}

}
