package com.chainsys.unittest;

import com.chainsys.variables.demoa;

public class variableTester {
	/***test static,constant,immutable variables*/

	public static void testGobalVariable()
	{
		System.out.println("DataA:"+demoa.DataA);
		System.out.println("DataC:"+demoa.DataC);
	demoa.DataA=2345;
	System.out.println("DataA:"+demoa.DataA);
	/**
	 * modiying value of the static field DataC
	 *<b>Error:</b> 
	 */
	}
	public static void testImmutableVariable()
	{
		/*cannot make a static reference to the non_static fiedld Demoa.DataB*/
		//Demoa.DataB=123;
		/**
		 * first create an object for the class
		 * pass an int value as an argument to the constructor
		 * access the immutableinstance field using the object reference
		 * */
demoa firstObject=new demoa(123);
System.out.println(firstObject.DataB);
/**
 * value assigned to an immutable field can not be changed
 * value for the immutable field can be assigned only through the constructor
 
 **/
//firstObject.Data=567;	
	}
	/**
	 *Calling non-static method using Object reference
	 * without creating an object, non static methods can not be called
	 * created on:25 March 2022
	 */
	public static void testNonStaticMethod() 
	{
		//ERROR
		//demoa.greetUser();
		demoa firstObject =new demoa(111);
		//call the non static method
		firstObject.greetUser();
	}
}
