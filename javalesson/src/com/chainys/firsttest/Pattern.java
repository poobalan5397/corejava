package com.chainys.firsttest;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		int countA=0;
		for(countA=1;countA<=9;countA++)
		{
			//if(countA<6) {
			for(int countB=9;countB>=countA;countB--)
			{
				System.out.print("*");}
				
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
	}

}
