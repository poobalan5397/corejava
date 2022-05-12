package com.chainsys.Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Double> tm=new TreeMap<String,Double>();
		tm.put("John Doe", 3434.34);
		tm.put("Tom smith", 123.22);
		tm.put("jane baker", 1378.00);
		tm.put("Told hall", 99.22);
		tm.put("ralph smith",-19.08);
		
		Set<Map.Entry<String,Double>> set=tm.entrySet();
		Iterator<Map.Entry<String,Double>> i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry<String,Double> me=i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
System.out.println();
//Deposit 1000 into john doe's account
double balance=tm.get("john doe");
tm.put("j", null);
	}

}
