package com.chainsys.edu.lessons.day8.exceptions.ex2;

public class A {
	public static void m3()
	{
		try
		{
			m4();
		}
		catch(Exception e)
		{
			System.out.println("Inside catch"+e.getMessage());
			Throwable t1=e.getCause();
			System.out.println("cause"+t1.getMessage());
		}
	}
	public static void m4() throws Exception
	{
		Exception e1=new Exception("error 1");
		//Inner Exception
		//e1 is nested inside e2
		Exception e2=new Exception("error 2,e1");
	throw e2;
	}
	public static void testM4() throws Exception
	{
		m4();
	}
}
