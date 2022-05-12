package com.chainsys.introduction;

import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkusername();
	}
	
	
	public static void checkusername()
	{
Scanner sc=new Scanner(System.in);//input stream
//prompt a message in the display console
System.out.println("enter your name");
//get name from the keyboard (input device), and store the name in a local variable
String userName=sc.nextLine();
sc.close();//closing the input stream
//streams are created and managed by the os.scanner is just a handle

System.out.println("Name is" + userName);
char[] nameAsCharacters=userName.toCharArray();
int lengthofcharArray=nameAsCharacters.length;
System.out.println("Length of your name is:"+ lengthofcharArray);
if(lengthofcharArray<3)
{
	System.out.println("Name must have atleast 3 char");
	return;
}
if(lengthofcharArray>15)
{
	System.out.println("name must not have more than 15 chars");
	return;
}
//ascii value for alphabets is 65 to 90 for upper cas
String nameInUppercase=userName.toUpperCase();
//remove blank space before, and after the name
nameInUppercase=nameInUppercase.trim();
char[] uppercaseCharArray=nameInUppercase.toCharArray();
lengthofcharArray=uppercaseCharArray.length;
int asciiValue=0;
for(int index=0; index<lengthofcharArray;index++)
{
	asciiValue=(int)uppercaseCharArray[index];
	System.out.println("ASII:"+asciiValue);
	if(asciiValue<65|| asciiValue>90)
	{
		if(asciiValue !=32)
		{
			System.out.println("In valid character in name:");
			return;
		}
	}
	
}
for(int index=0;index<lengthofcharArray;index++)
{
	System.out.println(index+" "+nameAsCharacters[index]);
}
	}

}
