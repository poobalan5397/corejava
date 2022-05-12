package com.chainsys.unittest;
import com.chainsys.practice.Studentperformance;
import com.chainsys.classandmethods.ABCBankBranch;
import com.chainsys.classandmethods.ABCBankCustomer;
import com.chainsys.classandmethods.ABCBankPerson;
import com.chainsys.classandmethods.ABCBankEmployee;
import com.chainsys.classandmethods.ABCBankCustomerAccountDetails;
public class ABCtester {

	public static void testbankbranch()
	{
		ABCBankBranch obj=new ABCBankBranch(1);
		obj.setLocation("chennai");
		obj.setManagerId(7);
		System.out.println(obj.getLocation());
		System.out.println(obj.getManagerId());
		System.out.println(obj.getId());
		System.out.println(obj.getBankName());
		
	}
	
	public static void testBankcustomer()
	{
		
		ABCtester.testBankPerson();
			}
	public static void testBankPerson()
	{
		
		ABCBankPerson obj=new ABCBankPerson(1);
		obj.setAddress("chennai");
		obj.setPhone_number(979177234);
		obj.setE_mail_address("poobalan5397@gmail.com");
		obj.setName("POOBALAN");
		System.out.println(obj.getAddress());
		System.out.println(obj.getPhone_number());
		System.out.println(obj.getE_mail_address());
		System.out.println(obj.getName());
		System.out.println(obj.getId());
	}
	public static void testBankemployee()
	{
		ABCtester.testBankPerson();
	}
	public static void testbankCustomerAccountDetails()
	{
		ABCBankCustomerAccountDetails obj=new ABCBankCustomerAccountDetails(5,9875438);
		obj.setAccount_type("saving");
		obj.setCurrent_balance(14.9f);
		System.out.println(obj.getAccount_type());
		System.out.println(obj.getCurrent_balance());
		System.out.println(obj.getCustomer_id());
		System.out.println(obj.getAccount_number());
		
		
}
	public static void testStudentperformace()
	{
	Studentperformance sp=new 	Studentperformance(2);
	System.out.println(sp.getid());
	sp.setName("poobalan");
	System.out.println(sp.getName());
	sp.setgroup("b");
	System.out.println(sp.getgroup());
	sp.setlocation("chennai");
	System.out.println(sp.getlocation());
	
	}
}