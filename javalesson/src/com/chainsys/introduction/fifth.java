package com.chainsys.introduction;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTriangleB();
	}
	
public static void printNumberOnetoHundred()
{
		int count =0;
for(count=0;count<=100;count++)
{
	System.out.print(count +" ");
}
	}

public static void printNumbersTentoOne() {
	int count =0;
	for(count=10;count>=1;count--)

{System.out.println(count+"");
}
}

public static void printMatrix()
{
	int countA=0;
	for(countA=1;countA<=10;countA++)
	{
		for(int countB=1;countB<=10;countB++)
		{
			System.out.print(countB+" ");
			}
		System.out.println();
		}
}
	

public static void printTriangle()
{
	int countA=0;
	for(countA=1;countA<=10;countA++)
	{
		for(int countB=1;countB<=countA;countB++)
		{
			System.out.print(countB+" ");
			}
		System.out.println();
		}
}

public static void printTriangleB()
{
	int countA=0;
	for(countA=1;countA<=9;countA++)
	{
		//if(countA<6) {
		for(int countB=9;countB>=countA;countB--)
		{
			System.out.print(" ");}
			
		for(int countc =countA;countc>=1;countc--)
		{
		System.out.print(countc);
		}
		for(int countc=2;countc <=countA;countc++)
		{
			System.out.print(countc);
		}
		System.out.println();
		}
	     
	     
		for(int count =0;count<=countA-5;count++)
		{
			System.out.print(" ");
		}
		for(int i=10-countA;i>=1;i--)
		{
			System.out.print(i);
		}
		for(int j=2;j<=10-countA;j++)
		{
			System.out.print(j);
		}
	     
		System.out.println();
	}
}