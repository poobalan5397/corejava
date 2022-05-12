package com.chainys.firsttest;


public class Animaltest {
String name;
int a;
String department;
Animaltest(String nam,int b,String depa)
{
	this.name=nam;
	this.a=b;
	this.department=depa;
}
public void show()
{
System.out.println(name+""+a+""+department);}
	
		public static void main(String args[]){  
		Animaltest s=new Animaltest("how",2,"mca");
		s.show();
		
		}
}
