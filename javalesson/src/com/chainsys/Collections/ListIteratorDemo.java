package com.chainsys.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ListIteratorDemo {
public static void main(String args[])
{
	ArrayList<String>stringArrayList=new ArrayList<String>();
	String s1="b";
	stringArrayList.add("c1");
	stringArrayList.add(s1);
	stringArrayList.add("a");
	stringArrayList.add("e");
	stringArrayList.add(s1);
	stringArrayList.add("D");
	stringArrayList.add("f");
	stringArrayList.add(s1);
	Iterator<String> string_itr=stringArrayList.iterator();
	while(string_itr.hasNext())
	{
		System.out.print(string_itr.next()+" ");
	}
	System.out.println();
	ListIterator<String> string_list_itr=stringArrayList.listIterator();
	while(string_list_itr.hasNext())
	{
		String element= string_list_itr.next();
		string_list_itr.set(element +"--");
	}
	string_itr=stringArrayList.iterator();
	while(string_itr.hasNext())
	{
		Object element= string_itr.next();
		//System.out.println(string_itr.next());
		System.out.print(element+" ");
	}
	System.out.println();
	while(string_list_itr.hasPrevious())
	{
		String element=string_list_itr.previous();
		System.out.println(element + " ");
	}
		
	}
}

