package com.chainsys.strings;

public class StringBuilderDemo {
public static void testA()
{
	String firstString="hello how are you today.is weather hot or cold.";
	StringBuilder stringbuilder=new StringBuilder();
	stringbuilder.ensureCapacity(250);
	System.out.println("Length="+stringbuilder.length());
	System.out.println("CAPACITY="+stringbuilder);
	stringbuilder.append(firstString);
	System.out.println("buffer="+stringbuilder);
	System.out.println("length="+stringbuilder.length());
	System.out.println("capacity="+stringbuilder.capacity());
	
	
	firstString="wish it rainsthis week";
	stringbuilder.append(firstString);
	System.out.println("buffer="+stringbuilder);
	System.out.println("length="+stringbuilder.length());
	System.out.println("capacity="+stringbuilder.capacity());
//reduce capacity to length
	stringbuilder.trimToSize();
	System.out.println("length"+stringbuilder.length());
	System.out.println("capacity"+stringbuilder.capacity());
	
	stringbuilder.replace(3, 8,"this is a test");
	System.out.println("replace"+stringbuilder);
	
	stringbuilder.insert(10,"this is august-");
	System.out.println("buffer="+stringbuilder);
	System.out.println("length="+stringbuilder.length());
	System.out.println("capacity="+stringbuilder.capacity());
	
	
	stringbuilder.delete(5,20);
	System.out.println("buffer="+stringbuilder);
	System.out.println("length="+stringbuilder.length());
	System.out.println("capacity="+stringbuilder.capacity());
	
	System.out.println("before reverse:"+stringbuilder);
	stringbuilder.reverse();
	System.out.println("After reverse:"+stringbuilder);
	
}
}
