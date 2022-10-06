package com.infinite.Agent;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAgentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int agentId;
		System.out.println("Enter Agent Id   ");
		agentId = sc.nextInt();
	    AgentDAO dao = new AgentDAO();
	    try {
			Agent agent = dao.searchAgent(agentId);
			if(agent!=null){
				System.out.println(agent);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
