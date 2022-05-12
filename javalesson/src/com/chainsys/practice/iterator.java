package com.chainsys.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> space=new ArrayList<String>();
space.add("hai");
space.add("spcae");
space.add("nirmal");
space.add("vishal");
space.add("tamil");
Iterator iterator=space.iterator();
while(iterator.hasNext())
{
	System.out.println(iterator.next());
}
	}

}
