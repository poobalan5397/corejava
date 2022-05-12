package com.chainsys.classandmethods;

public class ABCBankBranch {

	private final int id;
	private String location;
	private int managerId;
	private final static String bank_name="ABC Bank";
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getId() {
		return id;
	}
	public static String getBankName() {
		return bank_name;
	}
	public ABCBankBranch(int branchID)
	{
		this.id=branchID;
	}
}
