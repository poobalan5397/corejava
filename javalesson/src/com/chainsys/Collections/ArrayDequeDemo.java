package com.chainsys.Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String> arraydeque=new ArrayDeque<String>();
//use an arraydeque like a stack;
arraydeque.push("A");
arraydeque.push("B");
arraydeque.push("X");
arraydeque.push("Z");
arraydeque.push("D");
arraydeque.push("X");//duplicate value
arraydeque.push("Z");//duplicate value
arraydeque.push("E");
arraydeque.push("F");
System.out.println("before popping the stack:"+arraydeque.size());
//while(arraydeque.peek() !=null)
//	System.out.println(arraydeque.pop()+" ");
//System.out.println("after popping the stack:"+arraydeque.size());
Iterator<String> iterator=arraydeque.iterator();
while(iterator.hasNext())
{
	System.out.print("\t"+iterator.next());
}
System.out.println("");
Iterator<String> striterator=arraydeque.descendingIterator();
while(striterator.hasNext())
{
	System.out.print("\t"+striterator.next());
}
System.out.println("");
arraydeque.addFirst("h");
arraydeque.addLast("i");
iterator=arraydeque.iterator();
while(iterator.hasNext())
{
	System.out.print("\t"+iterator.next());
}
System.out.println("**********pollFirst:"+arraydeque.pollFirst());
System.out.println(arraydeque);
System.out.println("*************pollLast:"+arraydeque.pollLast());
System.out.println(arraydeque);
//---
//peekfirst
//retrives,but does not remove, the first element of this deque or
//returns null if this deque is empty

System.out.println("**********peekfirst:"+arraydeque.peekFirst());
System.out.println(arraydeque);
System.out.println("*************peekLast:"+arraydeque.peekLast());
System.out.println(arraydeque);
//peekfirst
//retrives and removes, the first element of this qeque
//this method differs from poll first only in that is throws an exception
//if those deque is empty

System.out.println("***********removeFirst:"+arraydeque.removeFirst());
System.out.println(arraydeque);
System.out.println("******removeLast:"+arraydeque.removeLast());


System.out.println("***********removeFirstoccurence:"+arraydeque.removeFirstOccurrence("x"));
System.out.println(arraydeque);
System.out.println("******removeLast:"+arraydeque.removeLastOccurrence(""));

	}

}
