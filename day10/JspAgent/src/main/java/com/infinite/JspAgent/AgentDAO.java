package com.infinite.JspAgent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgentDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public String addAgent(Agent agent)throws SQLException, ClassNotFoundException{
			connection = ConnectionHelper.getConnection();
			String cmd = "insert into Agent(name,city,Gender,MaritalStatus,Premium)" 
			+ " values(?,?,?,?,?)";
			pst = connection.prepareStatement(cmd);
			//pst.setInt(1, agent.getAgentId());
			pst.setString(1, agent.getName());
			pst.setString(2, agent.getCity());
			pst.setString(3, agent.getGender().toString());
			pst.setInt(4, agent.getMaritalStatus());
			pst.setDouble(5, agent.getPremium());
			pst.executeUpdate();
			return "Record Inserted...";
		}
	public Agent searchAgent(int agentId) throws SQLException, ClassNotFoundException{
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Agent where agentId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, agentId);
		ResultSet rs = pst.executeQuery();
		Agent agent = null;
		if(rs.next()){
		    agent = new Agent();
			agent.setAgentId(rs.getInt("agentId"));
			agent.setName(rs.getString("name"));
			agent.setCity(rs.getString("city"));
			agent.setGender(Gender.valueOf(rs.getString("gender")));
			agent.setMaritalStatus(rs.getInt("MaritalStatus"));
			agent.setPremium(rs.getInt("premium"));
		}
		return agent;
		}
		public List<Agent> showAgent() throws ClassNotFoundException, SQLException{
			List<Agent> agentList = new ArrayList<Agent>();
			connection = ConnectionHelper.getConnection();
			String cmd = "select * from Agent";
			pst = connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			Agent agent = null;
			while(rs.next()){
				agent = new Agent();
				agent.setAgentId(rs.getInt("agentId"));
				agent.setName(rs.getString("name"));
				agent.setCity(rs.getString("city"));
				agent.setGender(agent.getGender());
				agent.setMaritalStatus(rs.getInt("MaritalStatus"));
				agent.setPremium(rs.getInt("premium"));
				agentList.add(agent);
				}
			return agentList;
		}
		
}
