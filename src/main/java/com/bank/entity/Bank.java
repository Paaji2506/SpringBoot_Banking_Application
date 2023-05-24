package com.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bank_Table")
public class Bank {


		@Id
		private long accountNo;
		@Column(name = "Name")
		private String accountHolderName;
		@Column(name = "Password")
		private String accountPass;
		@Column(name = "Balance")
		private double accountBalance;
		private String address;
		private long mobileNo;
		private int status;
		public Bank() {
			super();
		}
		public Bank(long accountNo, String accountHolderName, String accountPass, double accountBalance, String address,
				long mobileNo, int status) {
			super();
			this.accountNo = accountNo;
			this.accountHolderName = accountHolderName;
			this.accountPass = accountPass;
			this.accountBalance = accountBalance;
			this.address = address;
			this.mobileNo = mobileNo;
			this.status = status;
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
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Bank [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountPass="
					+ accountPass + ", accountBalance=" + accountBalance + ", address=" + address + ", mobileNo="
					+ mobileNo + ", status=" + status + "]";
		}
		
		
		

	
}
