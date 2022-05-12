package com.chainys.firsttest;

public class customer implements persons,employee {
	public void space()
	{
		System.out.println("hai");
	}
	public void show()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
customer obj=new customer();
obj.space();
obj.show();
	}

}
