package com.infinite.hib;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries (  
	    {  
	        @NamedQuery(  
	        name = "showEmploy",  
	        query = "from Employ"  
	        ),
	        @NamedQuery(
		        	name="searchEmploy",
		        	query="from Employ where EMP_ID=:EMP_ID"
		        )
	        
	        	    }  
	)  

@Entity
@Table(name="employee")
public class Employ {

	
	@Id
	@Column(name="EMP_ID")
	private int EMP_ID;
	
	@Column(name="EMP_NAME")
	private String EMP_NAME;
	
	@Column(name="EMP_MAIL")
	private String EMP_MAIL;
	
	@Column(name="EMP_MOB_NO")
	private String EMP_MOB_NO;
	
	@Column(name="EMP_DT_JOIN")
	private String EMP_DT_JOIN;
	
	@Column(name="EMP_DEPT")
	private String EMP_DEPT;
	
	@Column(name="EMP_MANAGER_ID")
	private Integer EMP_MANAGER_ID;
	
	public Integer getEMP_MANAGER_ID() {
		return EMP_MANAGER_ID;
	}
	public void setEMP_MANAGER_ID(Integer eMP_MANAGER_ID) {
		EMP_MANAGER_ID = eMP_MANAGER_ID;
	}
	public void setEMP_MOB_NO(String eMP_MOB_NO) {
		EMP_MOB_NO = eMP_MOB_NO;
	}
	@Column(name="EMP_AVAIL_LEAVE_BAL")
	private String EMP_AVAIL_LEAVE_BAL;
	
	
	public int getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(int eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getEMP_NAME() {
		return EMP_NAME;
	}
	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	public String getEMP_MAIL() {
		return EMP_MAIL;
	}
	public void setEMP_MAIL(String eMP_MAIL) {
		EMP_MAIL = eMP_MAIL;
	}
	public String getEMP_MOB_NO() {
		return EMP_MOB_NO;
	}
	public void setEMP_MON_NO(String eMP_MON_NO) {
		EMP_MOB_NO = eMP_MON_NO;
	}
	public String getEMP_DT_JOIN() {
		return EMP_DT_JOIN;
	}
	public void setEMP_DT_JOIN(String eMP_DT_JOIN) {
		EMP_DT_JOIN = eMP_DT_JOIN;
	}
	public String getEMP_DEPT() {
		return EMP_DEPT;
	}
	public void setEMP_DEPT(String eMP_DEPT) {
		EMP_DEPT = eMP_DEPT;
	}
	
	public String getEMP_AVAIL_LEAVE_BAL() {
		return EMP_AVAIL_LEAVE_BAL;
	}
	public void setEMP_AVAIL_LEAVE_BAL(String eMP_AVAIL_LEAVE_BAL) {
		EMP_AVAIL_LEAVE_BAL = eMP_AVAIL_LEAVE_BAL;
	}
	@Override
	public String toString() {
		return "Employ [EMP_ID=" + EMP_ID + ", EMP_NAME=" + EMP_NAME + ", EMP_MAIL=" + EMP_MAIL + ", EMP_MON_NO="
				+ EMP_MOB_NO + ", EMP_DT_JOIN=" + EMP_DT_JOIN + ", EMP_DEPT=" + EMP_DEPT + ", EMP_MANAGER_ID="
				+ EMP_MANAGER_ID + ", EMP_AVAIL_LEAVE_BAL=" + EMP_AVAIL_LEAVE_BAL + "]";
	}
	public Employ(int eMP_ID, String eMP_NAME, String eMP_MAIL, String eMP_MON_NO, String eMP_DT_JOIN, String eMP_DEPT,
			int eMP_MANAGER_ID, String eMP_AVAIL_LEAVE_BAL) {
		super();
		EMP_ID = eMP_ID;
		EMP_NAME = eMP_NAME;
		EMP_MAIL = eMP_MAIL;
		EMP_MOB_NO = eMP_MON_NO;
		EMP_DT_JOIN = eMP_DT_JOIN;
		EMP_DEPT = eMP_DEPT;
		EMP_MANAGER_ID = eMP_MANAGER_ID;
		EMP_AVAIL_LEAVE_BAL = eMP_AVAIL_LEAVE_BAL;
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
