package com.chainys.firsttest;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner cubic=new Scanner(System.in);
System.out.println("Enter the numbers");
int number=cubic.nextInt();
int reverse;
int totalcubic=0;
while(number>0)
{
	reverse=number%10;
	totalcubic=totalcubic+reverse*reverse*reverse;
	//System.out.println(demo);
	number=number/10;
}
System.out.println("total cubices are:" +totalcubic);
if(totalcubic==number)
{
	System.out.println("same as a input data");
}
else if(totalcubic!=number)
{
	System.out.println("Different Number");
}


	}

}
