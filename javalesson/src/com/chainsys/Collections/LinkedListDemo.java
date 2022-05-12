package com.chainsys.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> StringLinkedList=new LinkedList();
	StringLinkedList.add("F");
	StringLinkedList.add("B");
	StringLinkedList.add("D");
	StringLinkedList.add("E");
	StringLinkedList.add("C");
	StringLinkedList.add("F");
	StringLinkedList.add("B");
	StringLinkedList.add("D");
	StringLinkedList.add("E");
	StringLinkedList.add("C");
	StringLinkedList.addLast("Z");
	StringLinkedList.addFirst("A");
	StringLinkedList.add(1, "A2");
	Iterator<String> StringIterator=StringLinkedList.iterator();																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
	//for(String i:StringIterator)
	while(StringIterator.hasNext())
	{
	System.out.print(StringIterator.next()+ " ");	
	}
	System.out.print(" ");
	StringLinkedList.removeFirst();
	StringLinkedList.removeLast();
	StringIterator=StringLinkedList.iterator();
	System.out.println(" ");
	while(StringIterator.hasNext()) {
		System.out.print(StringIterator.next()+" ");
	}	
	}
}
