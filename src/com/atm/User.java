package com.atm;
import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
	
	
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	private String firstName;
	
	private String lastName;
	
	private String uuid;
	
	private byte pinHash[];
	
	private ArrayList<Account> accounts;
	
	
	public User(String firstName,String LastName,String pin,Bank theBank){
		this.firstName=firstName;
		this.lastName=lastName;
		try {
			MessageDigest  md= MessageDigest.getInstance("MD5");
			this.pinHash=md.digest(pin.getBytes());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			System.err.println("error,cousgh Nosuchalgrthm");
			e.printStackTrace();
			System.exit(1);
		}
		this.uuid=theBank.getNewUserUUID();
		this.accounts=new ArrayList<Account>();
		
		/**
		 * Ceate new user
		 * @param firstName the user's name
		 * @param lastName  the user's  lastname
		 * @param pin      the users's account pin number 
		 * @param theBank 
		 */
		
		
		
		System.out.printf("New user %s,%s with ID %s created.\n",firstName,lastName,this.uuid );
		
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public byte[] getPinHash() {
		return pinHash;
	}

	public void setPinHash(byte[] pinHash) {
		this.pinHash = pinHash;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAcoounts(ArrayList<Account> acoounts) {
		this.accounts = accounts;
	}

	

	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		this.accounts.add(account);
	}
	
	/**
	 * get uuýd
	 * @return
	 */
	public String getUUID(){
		
		return this.uuid;
	}
	

}
