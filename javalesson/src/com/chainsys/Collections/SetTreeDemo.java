package com.chainsys.Collections;

import java.util.TreeSet;

import java.util.Iterator;

public class SetTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SetTreeDemo.demoA();
	}
	public static void demoA()
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("cut");
		ts.add("fun");
		ts.add("Assan");
		ts.add("Ball");
		ts.add("dog");
		ts.add("aag");
		ts.add("AAG");
		ts.add("event");
		ts.add("fan");
		//ts.add(null);
		ts.add("delhi");
		ts.add("carrot");
		ts.add("ball");
		ts.add("apple");
		ts.add("boy");
		ts.add("egg");
		ts.add("fool");
		System.out.println("size"+ts.size());
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
