package com.bank.service;

import com.bank.entity.Bank;
import com.bank.model.BankModel;
import com.bank.model.Deposit;
import com.bank.model.Transfer;
import com.bank.model.Withdraw;

public interface BankService {


	public Bank saveBankData(BankModel bankmodel);
	public String getBalance(Long accountNo);
	public String depositAmt(Deposit depo);
	public String withdrawAmt(Withdraw with);
	public String transferAmt(Transfer trans);
	public String deactivateAccount(com.bank.model.Delete delete);
}
