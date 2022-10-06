package com.infinite.agent;

public class Agent {

	private int agentId;
	private String name;
	private String city;
	private String Gender;
	private int MaritalStatus;
	private double premium;
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", name=" + name + ", city=" + city + ", Gender=" + Gender
				+ ", MaritalStatus=" + MaritalStatus + ", premium=" + premium + "]";
	}
	public Agent(int agentId, String name, String city, String gender, int maritalStatus, double premium) {
		super();
		this.agentId = agentId;
		this.name = name;
		this.city = city;
		Gender = gender;
		MaritalStatus = maritalStatus;
		this.premium = premium;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	}
