package com.chainsys.practice;
abstract class enterpresie
{ int sino;
String name;
	enterpresie()
	{
		System.out.println("hai");
	}
	void show()
	{
		
	}
	enterpresie(int n,String na)
	{
	this.sino=n;
	this.name=na;
	}
	void review()
	{
		
	}
}
 class space extends enterpresie 
{ 

	 space(int n,String na){
		 super( n, na);
	 }
	 void show()
	 {
	System.out.println("hello");
}
	 void review()
	 {
		 System.out.println(sino+" "+name);
	 }
	 }
public class engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//enterpresie ob=new space();
 enterpresie obj=new  space(1,"s");
		obj.show();
		obj.review();
	}

}
