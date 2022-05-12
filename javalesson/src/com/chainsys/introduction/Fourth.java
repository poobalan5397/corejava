package com.chainsys.introduction;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	taskA();
	taskB();}
	
	public static void taskA()
	{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("what is your name");
String name= sc.nextLine();
System.out.println(name);
//sc.close();
	}

	public static void taskB()
	{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("what is your number");
int firstvalue= sc.nextInt();
int result=firstvalue*100;
System.out.println(firstvalue);
sc.close();
	}
	
	//public static void taskC()
//	{
	//	String s1="100";
		//String s2="25";
		//
		
	}


