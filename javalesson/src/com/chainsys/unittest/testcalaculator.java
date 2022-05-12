package com.chainsys.unittest;
import edu.lessons.days60.oops.Interface.icalaculator;
import edu.lessons.days60.oops.Interface.calaculator;
import com.chainsys.introduction.ten;
public class testcalaculator {

	/*public static void main(String[] args){
		// TODO Auto-generated method stub
icalaculator test=new ten();
System.out.println("Addition  is "+ test.add(5, 2));
try {
System.out.println("Division  is "+ test.divide(6,0));}
catch(ArithmeticException e)
{
	System.out.println(e);
}
System.out.println("Multiplication  is "+test.multiply(4, 3));
	}*/
	calaculator test=new calaculator();
	public void space()
	{
		test.add(3,5);
		System.out.println(test.add(3,5));
		test.multiply(3,5);
		System.out.println(test.multiply(3,5));
		test.divide(10, 2);
		System.out.println(test.divide(10, 2));
	}

}
