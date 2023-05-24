package com.bank.model;

public class BankModel {

	private long accountNo;
	private String accountHolderName;
	private String accountPass;
	private String cfnAccountPass;
	private double accountBalance;
	private String address;
	private long mobileNo;
	private double deptAmt;
	private double withAmt;
	private long targetAccountNo;
	private double transferAmt;

	public BankModel() {
		super();
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountPass() {
		return accountPass;
	}

	public void setAccountPass(String accountPass) {
		this.accountPass = accountPass;
	}

	public String getCfnAccountPass() {
		return cfnAccountPass;
	}

	public void setCfnAccountPass(String cfnAccountPass) {
		this.cfnAccountPass = cfnAccountPass;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getDeptAmt() {
		return deptAmt;
	}

	public void setDeptAmt(double deptAmt) {
		this.deptAmt = deptAmt;
	}

	public double getWithAmt() {
		return withAmt;
	}

	public void setWithAmt(double withAmt) {
		this.withAmt = withAmt;
	}

	public long getTargetAccountNo() {
		return targetAccountNo;
	}

	public void setTargetAccountNo(long targetAccountNo) {
		this.targetAccountNo = targetAccountNo;
	}

	public double getTransferAmt() {
		return transferAmt;
	}

	public void setTransferAmt(double transferAmt) {
		this.transferAmt = transferAmt;
	}

}
