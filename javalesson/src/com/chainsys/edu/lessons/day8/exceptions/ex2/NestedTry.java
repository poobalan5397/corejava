package com.chainsys.edu.lessons.day8.exceptions.ex2;

import java.util.Scanner;

public class NestedTry {

	static String[] data;
	public static void main(String args[])
	{
		int num=0;
		int numValue=0;
		data=new String[2];
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			
		try {
			System.out.println("enter value for x");
			data[0]=sc.nextLine();//123--abcd--123 //
			//data[6] =sc.nextLine();
			numValue=Integer.parseInt(data[0]);//data[2]
			System.out.println("the square is"+ numValue * numValue);
		}
		catch(NumberFormatException nb)
		{
			System.out.println("not a number!");
		}
		num=data.length;
		System.out.println("Array length"+num);

		}
	catch(ArrayIndexOutOfBoundsException ne)
	{
		System.out.println("arrayIndexOutOfBounds-No argumejnts given!!!");
	}
	catch(Exception er)
	{
		System.out.println("exception"+er.getMessage());
	}
		
	}}
