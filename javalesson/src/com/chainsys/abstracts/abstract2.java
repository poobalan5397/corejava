package com.chainsys.abstracts;

abstract class employees
{
	void clear() {
	}
	void stop()
	{
		
	}
	
}
class spaces extends employee
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

public class abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
spaces ob=new spaces();
ob.clear();
ob.stop();
	}

}
