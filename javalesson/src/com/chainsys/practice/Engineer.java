package com.chainsys.practice;
abstract class car
{
	 void diesel()
	 {
		 System.out.println("rdgg");
	 }
	 void petrol()
	 {
	System.out.println("uhedg");
}}
class heavy extends car
{
	void diesel()
	{
		System.out.println("lorry");
	}
	
}
class lite extends heavy
{
	void petrol()
	{
		System.out.println("car");
	}

	

	
	
}
public class Engineer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//heavy s=new heavy();
		car obj=new lite();
		lite ob = (lite) obj;
		ob.petrol();
		ob.diesel();
	}

}
