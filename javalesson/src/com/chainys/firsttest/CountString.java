 package com.chainys.firsttest;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="Tom and Jerry are good friends";
		System.out.println(s2.split("\s").length);
		for(int i=s2.length()-1;i>=0;i--)
		{
			System.out.print(s2.charAt(i));
		}
		
	}

}
