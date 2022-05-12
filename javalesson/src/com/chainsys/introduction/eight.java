package com.chainsys.introduction;

import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
findEventNumbers();
	}
	//public static void checkUserName()
	//{
		public static void findEventNumbers() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter any 10digit number");
			long value=sc.nextLong();
			sc.close();
			long num=value;
			long reminder=0;
			while(num>0)
			{
				reminder=num%10;
				if(reminder%2==0)
				{
					System.out.println(reminder);
				}
				num=num/10;
			}
		
	}

		
}
