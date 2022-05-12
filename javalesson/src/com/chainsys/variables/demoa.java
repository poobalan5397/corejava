package com.chainsys.variables;

public class demoa {
public static int DataA;//static global variable
public final int DataB;//immutable global variable(not static)
public final static int DataC=300;//constant
private int dataD;//
//constructor
/*
 * construct is a special method
 * the name of the constructor and the name of the class will be same
 * constructor don't have return type
 * constructors can take parameters
 */
public demoa(int dataB)
{
	/*Assingning value to the global read only field(this.DataB)*/
this.DataB=dataB;

}
/**
 * static method can be called without an object
 * */
 

//static method can be called without an object
public static void sayHello()
{
	System.out.println("hello developer!!!");
}
/**
 * greetuser
 */
public void greetUser()
{
	System.out.println("greeting user");
}
}
