package com.chainsys.unittest;
import com.chainsys.variables.Calculator;
public class Caluclatortesting {
	public static void divideCalculatortester()
	{
		Calculator.divide(4,2);
		System.out.println("divide is value is"+Calculator.divide(4,2));
		
	}
	public static void addCalculatortester()
	{
		Calculator.add(4,0);
		System.out.println("add is value is"+Calculator.divide(4,0));
		
	}
	public static void substractCalculatortester()
	{
		Calculator.substract(4,1);
		System.out.println("substract is value is"+Calculator.substract(4,1));
		
	}
	public static void multipleCalculatortester()
	{
		Calculator.multiple(4,3);
		System.out.println("multiple is value is"+Calculator.divide(4,3));
		
	}

}
