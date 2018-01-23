package com.atm;
import java.util.ArrayList;
import java.util.Random;

public class Bank {
	
	private String name;
	
	private ArrayList<User> users;
	
	private ArrayList<Account> accounts;
	
	/**
	 * generate a new universary unique ýd
	 * @return
	 */
	public String getNewUserUUID(){
		String uuid = null;
		Random rng=new Random();
		int len=6;
		boolean nonUnique=false;
		
		do{
			uuid="";
			for(int c=0;c<len;c++){
				uuid+=((Integer)rng.nextInt(10)).toString();
			}
			//chech unique
			for(User u:this.users){
				if(uuid.compareTo(u.getUUID())==0){
					nonUnique=true;
					break;
					
				}
				
				
			}
		}while(nonUnique);
			
			
			
			
			
		return uuid;
		}
	
	
	public String getNewAccountUUID(){
		String uuid = null;
		Random rng=new Random();
		int len=10;
		boolean nonUnique=false;
		
		do{
			uuid="";
			for(int c=0;c<len;c++){
				uuid+=((Integer)rng.nextInt(10)).toString();
			}
			//chech unique
			for(Account a:this.accounts){
				if(uuid.compareTo(a.getUUID())==0){
					nonUnique=true;
					break;
					
				}
				
				
			}
		}while(nonUnique);
			
			
			
			
	return uuid;		
	}
		
	
	
	public void addAccount(Account anAcct){
		this.accounts.add(anAcct);
	}
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param pin
	 * @return
	 */
	public User addUser(String firstName,String lastName,String pin){
		User newUser=new User(firstName,lastName,pin,this);
		this.users.add(newUser);
		
		Account newAccount=new Account("saving",newUser,this);
		newUser.addAccount(newAccount);
		this.accounts.add(newAccount);
		return newUser;
		}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	
	

}
