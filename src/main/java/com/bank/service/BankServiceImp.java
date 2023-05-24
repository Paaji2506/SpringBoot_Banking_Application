package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Bank;
import com.bank.model.BankModel;
import com.bank.model.Delete;
import com.bank.model.Deposit;
import com.bank.model.GetModel;
import com.bank.model.Transfer;
import com.bank.model.Withdraw;
import com.bank.repo.BankRepo;

@Service
public class BankServiceImp implements BankService {

	@Autowired
	private BankRepo bankrepo;
	

	@Override
	public Bank saveBankData(BankModel bankmodel) {

		Bank bank=new Bank();
		
		if(bankmodel.getAccountPass().equalsIgnoreCase(bankmodel.getCfnAccountPass()))
				bank.setAccountPass(bankmodel.getAccountPass());  
		
	        	
		bank.setAccountNo(bankmodel.getAccountNo());
		bank.setAccountHolderName(bankmodel.getAccountHolderName());
		bank.setAccountBalance(bankmodel.getAccountBalance());
		bank.setAddress(bankmodel.getAddress());
		bank.setMobileNo(bankmodel.getMobileNo());
		bank.setStatus(1);
		return bankrepo.save(bank);
	}
	
		

	@Override
	public String getBalance(Long accountNo) {
		Bank bk=bankrepo.findById(accountNo).get();
		GetModel bk1=new GetModel();
		if(bk.getStatus()==1 && bk.getAccountNo()==accountNo)
		{
		bk1.setAccno(bk.getAccountNo());
		bk1.setAccname(bk.getAccountHolderName());
		bk1.setAccountBalance(bk.getAccountBalance());
		return "Account No : -->"+bk1.getAccno()+"\nAccount Holder Name : -->"+bk1.getAccname()+"\nAccount Balance : -->'"+bk1.getAccountBalance();
		}
		else
		{
			return "Your Account Is Deactivated...!!! \nCan't Get Deatils or Check Your Input...!!!"; 
		}
	}

	@Override
	public String depositAmt(Deposit depo) {
		Bank data=bankrepo.findById((long) depo.getAccno()).get();
		System.out.println(data);
		if(data.getStatus()==1 && data.getAccountNo()==depo.getAccno() && data.getAccountPass().equalsIgnoreCase(depo.getPassword()))
		{
		String sms="Previous Account Balance ---> "+data.getAccountBalance()+" \nAnd  Your Deposit Amount is --->"+depo.getAccno();
		double newAmt=data.getAccountBalance()+depo.getAmount();
		data.setAccountBalance(newAmt);
		Bank bk= bankrepo.save(data);
		String sms1=null;
		if(bk!=null)
		{
			sms1=sms+"\nYour Orignal balance Is : ----->"+data.getAccountBalance();
		}
		return sms1;
		}
		else
		{
			return " Your Account Is Deactivated...!!\n Opretions Not Possible or Check Your Input...!!!";
		}
	}

	@Override
	public String withdrawAmt(Withdraw with) {
		Bank data=bankrepo.findById(with.getAccno()).get();
		if(data.getStatus()==1 && with.getAccno()==data.getAccountNo() && data.getAccountPass().equalsIgnoreCase(with.getPassword())) 
		{
		String sms="Previous Account Balance ---> "+data.getAccountBalance()+" \nAnd  Your Withdraw Amount is --->"+with.getWithAmt();
		double newAmt=data.getAccountBalance()-with.getWithAmt();
		data.setAccountBalance(newAmt);
		Bank bk= bankrepo.save(data);
		String sms1=null;
		if(bk!=null)
		{
			sms1=sms+"\nYour Orignal balance Is : ----->"+data.getAccountBalance();
		}
		return sms1;
		}
		else
		{
			return " Your Account Is Deactivated...!!\n Opretions Not Possible Or Check Your Input...!!!";
			}
	}

	@Override
	public String transferAmt(Transfer trans) {
		Bank data=bankrepo.findById(trans.getAccno()).get();
		Bank data1=bankrepo.findById(trans.getTargetacc()).get();
		if(data.getStatus()==1 && data.getAccountNo()==trans.getAccno() && data.getAccountPass().equalsIgnoreCase(trans.getPassword()))
		{
		String s1="Your Account previous Amount : --->"+data.getAccountBalance()+"\nYour Transfer Amount : ---->"+trans.getTransferAmt();
		String s2="\nYour Target Account Amount : ----> "+data1.getAccountBalance();
		data.setAccountBalance(data.getAccountBalance()-trans.getTransferAmt());
		data1.setAccountBalance(data1.getAccountBalance()+trans.getTransferAmt());
		
		Bank bk=bankrepo.save(data);
		Bank bk1=bankrepo.save(data1);
		
		String sms=null;
		if(bk!=null && bk1!=null) {
			sms=s1+"\nYour Current Balance  : ----->"+data.getAccountBalance()+s2+"\nTarget Account Current Balance : --->"+data1.getAccountBalance();
		}
		return sms;
		}
		else
		{
			return " Your Account Is Deactivated...!!\n Opretions Not Possible Or Check Your Input..!!!";
		}
	}



	@Override
	public String deactivateAccount(Delete delete) {
		
		Bank data=bankrepo.findById(delete.getAccno()).get();
		String sms=null;
		if(data.getStatus()==1 && data.getAccountNo()==delete.getAccno() && data.getAccountPass().equalsIgnoreCase(delete.getPassword()))
		{
			data.setStatus(0);
			bankrepo.save(data);
			if(data!=null)
			{
				sms="Your Account Is Deactivated...!!!!";
			}
			return sms;
		}
		else
		{
			return "Your Account Is Allready Deactivated...!!! OR\n Check Your Input...!!!!";
		}
	}
	
	}











