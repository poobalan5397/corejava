package com.chainsys.abstracts;

abstract class employee
{
	 void clear() {
	}
	 void stop()
	{
		
	}
	
}
class space extends employee
{
	 void clear()
	{
		System.out.println("hai");
	}
}
class noise extends employee
{
	 void stop()
	{
		System.out.println("hellow");
	}
}
public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
space ob=new space();
noise obj=new noise();
ob.clear();
obj.stop();
	}

}
