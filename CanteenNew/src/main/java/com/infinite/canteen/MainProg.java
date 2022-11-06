package com.infinite.canteen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.ConnectionHelper;

public class MainProg {

	SessionFactory sessionFactory;
	
	public List<String> showMenu(){
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Query query = session.createQuery("from Menu");
		List<String> list = query.list();
		return list;
	}
	
	public Menu searchMenu(int rest_id) {
		sessionFactory  = SessionHelper.getConnection();
  	    Session session=sessionFactory.openSession();  
		Query query = session.createQuery("from Menu");
		List<Menu> menuList = query.list();
		if (menuList.size()==0) {
			return null;
		} 
		return menuList.get(0);
	}

	
	public String AddMenu(Menu menu) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		String menuid=generateMenuID();
		menu.setMenu_id(menuid);
		Transaction tran = session.beginTransaction();
		session.save(menu);
		tran.commit();
		return "Menu Added";
		
	}
	
	public String generateMenuID() {
		
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Menu.class);
		List<Menu> menulist = cr.list();
		session.close();
		
		if(menulist.size()==0) {
			return "M001";
		}
		else {
		String id = menulist.get(menulist.size()-1).getMenu_id();
		int id1 = Integer.parseInt(id.substring(1));
		id1++;
		String id2 = String.format("M%03d", id1);
		return id2;
		}
	}

	public Menu searchRest(int rest_id) {
		sessionFactory  = SessionHelper.getConnection();
  	    Session session=sessionFactory.openSession();  
		Query query = session.createQuery("from Menu");
		List<Menu> restList = query.list();
		if (restList.size()==0) {
			return null;
		} 
		return restList.get(0);
	}


}
