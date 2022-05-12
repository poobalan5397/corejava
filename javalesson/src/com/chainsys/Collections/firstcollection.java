package com.chainsys.Collections;

import java.util.ArrayList;

public class firstcollection {
	public static void main(String[] args)
	{
	
		
		ArrayList<String>StringArrayList=new ArrayList<String>();
		
		 System.out.println("Initial size of stringArrayList : "+StringArrayList.size());
	        try 
	        {
	            StringArrayList.add("Car");
		StringArrayList.add("Auto");
		StringArrayList.add("egg");
		StringArrayList.add("box");
		StringArrayList.add("doll");
		StringArrayList.add("fan");
		//will inset a new value
		//pushing the current value of index 1 to the next index
		StringArrayList.add(1,"annimal");
		StringArrayList.add("gril");
		StringArrayList.add("fan");
		System.out.println("sixe of string arraylist afer additions:"+StringArrayList.size());
		System.out.println("contents of stringarraylist:" + StringArrayList);
		//will replace the value in index2
		StringArrayList.set(14, "xenas");
		System.out.println("after set(2):"+StringArrayList.lastIndexOf("fan"));
		//
		System.out.println("last index of:'fan'"+ StringArrayList.lastIndexOf("fan"));
		//remove the first instance of 'fan'
		StringArrayList.remove("fan");
		StringArrayList.remove(1);
		System.out.println("sixe after remove(2):"+StringArrayList.size());
		System.out.println("contents of stringarralist"+StringArrayList);
		// Will reduce the capacity
        StringArrayList.trimToSize();
    }
	catch(Exception err)
    {
        System.out.println(err.getMessage());
    }
    

	}
}
