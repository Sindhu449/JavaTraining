package com.infinite.hib;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries (  
	    {  
	        @NamedQuery(  
	        name = "searchLeave",  
	        query = "from LeaveHistory where EMP_ID=:Manager_ID"  
	        )
	    }  
	)  


@Entity
@Table(name="leave_history")
public class LeaveHistory {
	
	@Id
	@Column(name="LEAVE_ID")
	private int leave_Id;
	
	@Column(name="LEAVE_NO_OF_DAYS")
	private int leave_NoofDays;
	
	@Column(name="LEAVE_MNGR_COMMENTS")
	private String leave_ManagerComments;
	
	@Column(name="EMP_ID")
	private int EMP_ID;
	
	@Column(name="LEAVE_START_DATE")
	private Date leave_StartDate;
	
	@Column(name="LEAVE_END_DATE")
	private Date leave_EndDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="LEAVE_TYPE")
	private LeaveType leave_Type;
	
	@Enumerated(EnumType.STRING)
	@Column(name="LEAVE_STATUS")
	private LeaveStatus leave_Status;
	
	@Column(name="LEAVE_REASON")
	private String leave_Reason;
	
	public int getLeave_Id() {
		return leave_Id;
	}
	public void setLeave_Id(int leave_Id) {
		this.leave_Id = leave_Id;
	}
	public int getLeave_NoofDays() {
		return leave_NoofDays;
	}
	public void setLeave_NoofDays(int leave_NoofDays) {
		this.leave_NoofDays = leave_NoofDays;
	}
	public String getLeave_ManagerComments() {
		return leave_ManagerComments;
	}
	public void setLeave_ManagerComments(String leave_ManagerComments) {
		this.leave_ManagerComments = leave_ManagerComments;
	}
	public int getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(int eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public Date getLeave_StartDate() {
		return leave_StartDate;
	}
	public void setLeave_StartDate(Date leave_StartDate) {
		this.leave_StartDate = leave_StartDate;
	}
	public Date getLeave_EndDate() {
		return leave_EndDate;
	}
	public void setLeave_EndDate(Date leave_EndDate) {
		this.leave_EndDate = leave_EndDate;
	}
	public LeaveType getLeave_Type() {
		return leave_Type;
	}
	public void setLeave_Type(LeaveType leave_Type) {
		this.leave_Type = leave_Type;
	}
	public LeaveStatus getLeave_Status() {
		return leave_Status;
	}
	public void setLeave_Status(LeaveStatus leave_Status) {
		this.leave_Status = leave_Status;
	}
	public String getLeave_Reason() {
		return leave_Reason;
	}
	public void setLeave_Reason(String leave_Reason) {
		this.leave_Reason = leave_Reason;
	}
	@Override
	public String toString() {
		return "LeaveHistory [leave_Id=" + leave_Id + ", leave_NoofDays=" + leave_NoofDays + ", leave_ManagerComments="
				+ leave_ManagerComments + ", EMP_ID=" + EMP_ID + ", leave_StartDate=" + leave_StartDate
				+ ", leave_EndDate=" + leave_EndDate + ", leave_Type=" + leave_Type + ", leave_Status=" + leave_Status
				+ ", leave_Reason=" + leave_Reason + "]";
	}
	public LeaveHistory(int leave_Id, int leave_NoofDays, String leave_ManagerComments, int eMP_ID,
			Date leave_StartDate, Date leave_EndDate, LeaveType leave_Type, LeaveStatus leave_Status, String leave_Reason) {
		super();
		this.leave_Id = leave_Id;
		this.leave_NoofDays = leave_NoofDays;
		this.leave_ManagerComments = leave_ManagerComments;
		EMP_ID = eMP_ID;
		this.leave_StartDate = leave_StartDate;
		this.leave_EndDate = leave_EndDate;
		this.leave_Type = leave_Type;
		this.leave_Status = leave_Status;
		this.leave_Reason = leave_Reason;
	}
	public LeaveHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
