package com.chainsys.Collections;

import java.util.Iterator;

import java.util.Properties;
import java.util.Set;

public class DictionaryPropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Properties capitals = new Properties();
Set<Object>states;
String str;
capitals.put("Illinois", "Springfield");
capitals.put("florida","tallahasssee");
capitals.put("missouri","jefferson city");
capitals.put("washington","olympia");
capitals.put("california","sacramento");
capitals.put("Indiana","indianapolis");
states=capitals.keySet();
System.out.println(states);
Iterator<Object> itr=states.iterator();
while(itr.hasNext())
{
	str=(String) itr.next();
	System.out.println("the capital of"+ str+"is"+capitals.getProperty(str)+".");
}
//look for state not in list----speficy default
str=capitals.getProperty("florida","notfound");
//str=capitals.getproperty("florida");
System.out.println("the captial of florida is"+str);
	
	//look for state not in list--specify dfault
	str=capitals.getProperty("");
}

	}


