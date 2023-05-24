package com.bank.model;

public class Transfer {

	private long accno;
	private String accname;
	private String password;
	private long targetacc;
	private double transferAmt;
	public Transfer() {
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
public long getTargetacc() {
	return targetacc;
}
public void setTargetacc(long targetacc) {
	this.targetacc = targetacc;
}
public double getTransferAmt() {
	return transferAmt;
}
public void setTransferAmt(double transferAmt) {
	this.transferAmt = transferAmt;
}

}
