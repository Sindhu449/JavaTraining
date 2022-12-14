package com.infinite.emp;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave_history")
public class LeaveTable {
	
	@Id
	@Column(name="Leave_ID")
	private int leave_id;
	
	@Column(name="LEAVE_NO_OF_DAYS")
	private int lEAVE_NO_OF_DAYS;
	
	@Column(name="empno")
	private int empno;
	
	@Column(name="LEAVE_START_DATE")
	private Date lEAVE_START_DATE;
	
	@Column(name="LEAVE_END_DATE")
	private  Date lEAVE_END_DATE;
	
	@Column(name="LEAVE_REASON")
	private String lEAVE_REASON;
	
	@Column(name="LOSS_OF_PAY")
	private double lOSS_OF_PAY;

	public int getLeave_id() {
		return leave_id;
	}

	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}

	public int getlEAVE_NO_OF_DAYS() {
		return lEAVE_NO_OF_DAYS;
	}

	public void setlEAVE_NO_OF_DAYS(int lEAVE_NO_OF_DAYS) {
		this.lEAVE_NO_OF_DAYS = lEAVE_NO_OF_DAYS;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public Date getlEAVE_START_DATE() {
		return lEAVE_START_DATE;
	}

	public void setlEAVE_START_DATE(Date lEAVE_START_DATE) {
		this.lEAVE_START_DATE = lEAVE_START_DATE;
	}

	public Date getlEAVE_END_DATE() {
		return lEAVE_END_DATE;
	}

	public void setlEAVE_END_DATE(Date lEAVE_END_DATE) {
		this.lEAVE_END_DATE = lEAVE_END_DATE;
	}

	public String getlEAVE_REASON() {
		return lEAVE_REASON;
	}

	public void setlEAVE_REASON(String lEAVE_REASON) {
		this.lEAVE_REASON = lEAVE_REASON;
	}

	public double getlOSS_OF_PAY() {
		return lOSS_OF_PAY;
	}

	public void setlOSS_OF_PAY(double lOSS_OF_PAY) {
		this.lOSS_OF_PAY = lOSS_OF_PAY;
	}
	
	
	}
