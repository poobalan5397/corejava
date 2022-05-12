package com.chainsys.abstracts;

abstract class employei
{
String name;
int sino;
employei()
	{
		System.out.println("hai");
}
	employei(String n,int s){
		this.name=n;
		this.sino=s;
	}
	void clear()
	{
		
	}
	}
	
class spacesss extends employei
{
	 spacesss(String n,int s){
	 super(n,s);
	 }
	public spacesss() {
		// TODO Auto-generated constructor stub
	}
	void clear()
	 {
		 System.out.println("hi"+" "+3);
	 }
}
public class abstract4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
spacesss s1=new spacesss();

s1.clear();
	}

}
