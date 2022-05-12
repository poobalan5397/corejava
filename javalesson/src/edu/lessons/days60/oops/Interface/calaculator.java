package edu.lessons.days60.oops.Interface;

public class calaculator implements icalaculator{
	
		public  int add(int v1,int v2)
		{
			int x=v1+v2;
			return x;
		}
		public  int multiply(int v1,int v2)
		{
			int x=v1*v2;
			return x;
		}
		public int divide(int v1,int v2)
		{
			int x=v1/v2;
			return x;
			
		}
}
