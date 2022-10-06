package com.infinite.Agent;

import java.sql.SQLException;
import java.util.List;

public class ShowAllMain {

	public static void main(String[] args) {
			AgentDAO dao = new AgentDAO();
			try {
				List<Agent> agentList = dao.showAgent();
				for (Agent agent : agentList) {
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
