package com.chainys.firsttest;
import java.util.Scanner;
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
String string1=sc.nextLine();
String name=string1.toUpperCase();
char[] charname=name.toCharArray();
int lengthofString=charname.length;
int asciiValue=0;
for(int i=0;i<lengthofString;i++)
{
       asciiValue=(int)charname[i];
}
if((asciiValue>65)||(90<asciiValue))
{
       System.out.println("Name contains Alphabets");
}
else
{
       System.out.println("Name should be alphabets");
}
if(lengthofString<8)
{
       System.out.println("Name greater than 8 characters");
       return;
}

}
}

