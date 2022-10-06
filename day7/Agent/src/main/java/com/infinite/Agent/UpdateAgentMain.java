package com.infinite.Agent;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAgentMain {

	public static void main(String[] args) {
		Agent agent = new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent Id  ");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent name  ");
		agent.setName(sc.next());
		System.out.println("Enter Agent city   ");
		agent.setCity(sc.next());
		System.out.println("Enter Gender  ");
		String gen = sc.next();
		if (gen.toUpperCase().equals("MALE")) {
			agent.setGender(Gender.MALE);
		} else {
			agent.setGender(Gender.FEMALE);
		}
		System.out.println("Enter Agent MaritalStatus  ");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("Enter Agent Basic  ");
		agent.setPremium(sc.nextDouble());
		
	}
}
