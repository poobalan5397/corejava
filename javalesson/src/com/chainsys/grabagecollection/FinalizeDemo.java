package com.chainsys.grabagecollection;

public class FinalizeDemo
{
	public static void main(String args[])throws Exception
	{
		Calculator c1=new Calculator();
		c1.add(100,50);
		c1=null;
		Calculator c2=new Calculator();
		Calculator c3=new Calculator();
//creating an object for runtime
		//it isnot possible to create an object directly fot runtime like
		//runtime firstRt=new runtime();
		//the default contructor for runtime is private here
		//so we use a static method gerRuntime() of the runtime class to create
		//an object for runtime
Runtime rt=Runtime.getRuntime();//factorymethod
	     rt.gc();	//forcing garbage collection
		c2=null;
		c3=null;
		rt.gc();
		//System.in.read();
	}
}
