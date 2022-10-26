package com.infinite.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class AgentUpdateMain {

	public static void main(String[] args) {
		Agent agent = new Agent();
		Scanner sc =new Scanner(System.in);
		System.out.println("Emter AgentID ");
		agent.setAgentID(sc.nextInt());
		System.out.println("Enter Name ");
		agent.setName(sc.next());
		System.out.println("Enter City ");
		agent.setCity(sc.next());
		System.out.println("Enter gender ");
		agent.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter maritalStatus ");
		agent.setMaritalstatus(sc.next());
		System.out.println("Enter Premium ");
		agent.setPremium(sc.nextInt());
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Agent where AgentID="+agent.getAgentID());
		List<Agent> agentList = query.list();
		session.close();
		if (agentList.size()==1) {
			session = sf.openSession();
			Transaction trans = session.beginTransaction();
			session.saveOrUpdate(agent);
			trans.commit();
			System.out.println("*** Record Updated***");
		} else {
			System.out.println("*** Recored not Founf ***");
		}
	}

}
