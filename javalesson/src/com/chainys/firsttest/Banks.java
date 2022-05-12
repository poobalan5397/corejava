package com.chainys.firsttest;

public class Banks {

	private final int ID;
	private int accountnumber;
	private String address;
	private int phone;
	private String emailid;
	private String Savingaccount;
	private String Currentaccount;
	
	public Banks(int id) {
this.ID=id;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getSavingaccount() {
		return Savingaccount;
	}

	public void setSavingaccount(String savingaccount) {
		Savingaccount = savingaccount;
	}
	
}

