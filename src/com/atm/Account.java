package com.atm;
import java.util.ArrayList;

public class Account {
	
	private String name;
	
	private double balance;
	
	private String uuid;
	
	private User holder;
	
	private ArrayList<Transaction> transactions;
	
	public Account(String name,User holder,Bank theBank){
		this.name=name;
		this.holder=holder;
		
		//get the new account UUID
		this.uuid=theBank.getNewAccountUUID();
		
		///init trassaction
		this.transactions=new ArrayList<Transaction>();
		
		//add to holder and bank lists
		holder.addAccount(this);
		//holder.accounts.add(this);
		theBank.addAccount(this);
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public User getHolder() {
		return holder;
	}

	public void setHolder(User holder) {
		this.holder = holder;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public String getUUID() {
		// TODO Auto-generated method stub
		return  this.uuid;
	}
	
	
	
	

}
