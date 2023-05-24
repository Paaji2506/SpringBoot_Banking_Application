package com.bank.model;

public class Deposit {

	private int accno;
	private String accname;
	private String password;
	private double amount;
	public Deposit() {
		super();
	}
	public Deposit(int accno, String accname, String password, double amount) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.password = password;
		this.amount = amount;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Deposit [accno=" + accno + ", accname=" + accname + ", password=" + password + ", amount=" + amount
				+ "]";
	}
	
	
}
