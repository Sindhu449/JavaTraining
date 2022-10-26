package com.infinite.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Agent")
public class Agent {

	@Id
	@Column(name="AgentID")
	private int AgentID;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="City")
	private String city;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="GENDER")
	private Gender gender;
	
	@Column(name="MaritalStatus")
	private String maritalstatus;	
	
	@Column(name="Premium")
	private double premium;
	
	public int getAgentID() {
		return AgentID;
	}
	public void setAgentID(int agentID) {
		AgentID = agentID;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [AgentID=" + AgentID + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", maritalstatus=" + maritalstatus + ", premium=" + premium + "]";
	}
	public Agent(int agentID, String name, String city, Gender gender, String maritalstatus, double premium) {
		super();
		AgentID = agentID;
		this.name = name;
		this.city = city;
		this.gender = gender;
		this.maritalstatus = maritalstatus;
		this.premium = premium;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
