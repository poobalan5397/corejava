package com.chainsys.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Contents of al : "+al);
//        Object data[]=al.toArray();
        int sum=0;
//        for(int i=0;i<data.length;i++)
//            sum +=((Integer)data[i]).intValue();
       // for(Integer i:al)
        	//System.out.println(i);
        
        Iterator<Integer> intIterator =al.iterator();
        while(intIterator.hasNext())
        {
            sum +=intIterator.next();
        }
        System.out.println("Sum is: "+sum);
	}

}
