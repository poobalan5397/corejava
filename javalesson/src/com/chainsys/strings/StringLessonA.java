package com.chainsys.strings;

public class StringLessonA {
	public static void lessonOne() {
		// String is an array of characters
		String firstString = "chainsys";
		System.out.println(firstString);
		char dataOne[] = { 'c', 'h', 'a', 'i', 'n' };
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString = new String(new char[] { 'c', 'h', 'a', 'i', 'n' });
		System.out.println(thirdString);
	}

	public static void lessonTwo() {
		String firstString = "Hello";
		String secondString = "Hello";
		String thirdString = "Hello";
		int firstNumber = 100;
		int secondNumber = 100;
		int thirdNumber = 100;
		System.out.println(firstString);
		System.out.println(secondString);
		firstString = "welcome";
		System.out.println(firstString);
		System.out.println(secondString);
	}

	public static void creatingStringInaForLoop() {
		for (int count = 0; count < 10; count++) {
			String s1 = "hello";
		}
	}

	public static void stringToCharArray() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Entter a Word");
		String firstString = scanner.nextLine();
		scanner.close();
		int stringlength = firstString.length();
		System.out.println("Length" + stringlength);
		char[] data = firstString.toCharArray();
		int dataarraylength = data.length;
		System.out.println("Length" + dataarraylength);
	}

	public static void stringToUpperLower() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Entter a Word");
		String firstString = scanner.nextLine();
		scanner.close();
		// int stringlength=firstString.length();
		System.out.println(firstString);
		String stringInUppercase = firstString.toUpperCase();
		System.out.println("toUpperCase=" + stringInUppercase);
		System.out.println("s1=" + firstString);
		String StringInLowercase = firstString.toLowerCase();
		System.out.println("toLowerCase" + StringInLowercase);
		System.out.println("s1=" + firstString);
		// substring
		// from the 4th char till end
		String substring = firstString.substring(3);
		System.out.println(substring);
		// from 3rd char to 6th char (i.e excluding 7th char)
		// from index 2 to index 5
		substring = firstString.substring(2, 6);
		System.out.println(substring);
		// replace
		String replacedstring = firstString.replace('a', 'e');
		System.out.println(replacedstring);
		// equals
		boolean flag1 = firstString.equals(stringInUppercase);// false
		System.out.println(flag1);
		// equalsIgnoreCase
		boolean flag = firstString.equalsIgnoreCase(stringInUppercase);// true
		System.out.println(flag);
	}

	
	/* public static void testStringTrim() { String
	 secondsstring=" Hope   it   rain   ";
	System.out.println("Before Trim:"+secondString.length());
	  secondString=secondString.trim();
	  System.out.println("after trim:"+secondString.length()); }
	 
	
	/* * public static void testvoid() { String
	 * firstString="  Tom and jerry are good friends "; String trimmed }
	 */
	/*public static void ttestSplitDays() {
		String weekdays = "Mon;Tue;Wed;Thu;Fri;Sat;Sun";
		String[] data = weekdays.split(";");
		int count = data.length;
		System.out.println("days Count" + count);
		for (int index = 0; index < count; index++) {
			System.out.println(data[index]);

		}}*/
	//public static void testSplitdays()
	//{
		public static void reverse()
		{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("enter a sentence");
		String sentence="";
		try {
			sentence=scanner.nextLine();
		}
		finally
		{
			scanner.close();
		}
		char[]reverse=sentence.toCharArray();
		for(int name=reverse.length-1;name>=0;name--)
		{
		System.out.print(reverse[name]);
		}
		
}
			
	public static void verifyString(String s1)	//verify and print
	{
		if(null==s1)
		{
			System.out.print("string is null");
			return;
		}
		else
			System.out.println("string is not null"+s1);
		if(!s1.isEmpty())
		{
			System.out.println("\t not empty"+s1);
		}
			else
				System.out.println("\t n string is empty");
		}
	
		
		
		
	

}
