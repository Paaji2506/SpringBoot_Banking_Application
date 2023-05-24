package com.bank.model;

public class Withdraw {

	private long accno;
	private String accname;
	private String password;
	private double withAmt;
	public Withdraw() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getWithAmt() {
		return withAmt;
	}
	public void setWithAmt(double withAmt) {
		this.withAmt = withAmt;
	}
	
}
