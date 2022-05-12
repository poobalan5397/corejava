package com.chainys.firsttest;
import java.util.Scanner;
public class Tempature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("start the convasation");
String weather=sc.nextLine();
if(weather.contains("here raining?"))
{
System.out.println("tell the user to get an umbrella.");
}
else
{
	System.out.println("invalid sentence");
	return;
}
System.out.println("Based on the temperature bring the jacket please enter the degree below");
int winter=sc.nextInt();
if(winter<32)
{
	System.out.println("Bring heavy jacket");
}
else if(winter>32&&winter<50)
{
	System.out.println("no jacket at all. ");
	}

}}
