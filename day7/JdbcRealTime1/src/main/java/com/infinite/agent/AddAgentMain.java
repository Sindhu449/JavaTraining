package com.infinite.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class AddAgentMain {

	public static void main(String[] args) {
		Agent agent = new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent Id ");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent name");
		agent.setName(sc.next());
		System.out.println("Enter Agent City ");
		agent.setCity(sc.next());
		System.out.println("Enter Gender ");
		agent.setGender(sc.next());
		System.out.println("Enter maritalstatus");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("Enter premium");
		agent.setPremium(sc.nextDouble());
		System.out.println("**Agent Record Added**");
		AgentDAO dao = new AgentDAO();
		try {
			System.out.println(dao.addAgent(agent));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
