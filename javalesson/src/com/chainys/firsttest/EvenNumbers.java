package com.chainys.firsttest;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size");
int number = sc.nextInt();
int even []=new int[number];
System.out.println("enter array elements are");
for(int i=0;i<number;i++)
{
	even[i]=sc.nextInt();
}
for(int j=0;j<number;j++)
{
	if(even[j]%2==0)
	{
		System.out.println(even[j]);
	}
}

	}

}
