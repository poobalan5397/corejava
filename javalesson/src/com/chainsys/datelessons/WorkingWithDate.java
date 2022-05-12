package com.chainsys.datelessons;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class WorkingWithDate {
	public static void displayCurrentDate()
	{
Calendar vCalendar=Calendar.getInstance();
Date date =vCalendar.getTime();
System.out.println(date);
SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
System.out.println(dateFormat);
	}
public static void displayDOB()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your DOB:(yyyy-mm-dd)");
	String dob=sc.nextLine();
	sc.close();
	int year=Integer.parseInt(dob.substring(0, 4));
	int month=Integer.parseInt(dob.substring(5, 7))-1;
	int day=Integer.parseInt(dob.substring(8, 10));
System.out.println(year+"-"+month+"-"+day);

Calendar date=new GregorianCalendar(year,month,day);
Date dob1 =date.getTime();
SimpleDateFormat f1=new SimpleDateFormat("yyyy-MM-dd");
System.out.println("DOB"+f1.format(dob1));
//retirement date;

date.add(Calendar.YEAR,60);
date.add(Calendar.MONTH, 1);
date.add(Calendar.DAY_OF_MONTH,1);
date.add(Calendar.DATE, -1);
System.out.println("DOB"+f1.format(date.getTime()));
}
}
