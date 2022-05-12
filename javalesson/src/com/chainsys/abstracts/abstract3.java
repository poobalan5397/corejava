package com.chainsys.abstracts;

abstract class employei
{
	abstract void clear() ;
	
	abstract void stop();	
}
class spacess extends employei
{
	 void clear()
	{
		System.out.println("hai");
	}
	void stop()
	{
		System.out.println("hellow");
	}
}
class spacis extends employei
{
	 void clear()
		{
			System.out.println("h");
		}
		void stop()
		{
			System.out.println("hel");
		}
}
public class abstract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
spacess ob=new spacess();
ob.clear();
ob.stop();
	}

}
