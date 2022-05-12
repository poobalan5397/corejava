package com.chainsys.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class school {

	public static void main(String[] args) throws {
		// TODO Auto-generated method stub
		school s=new school();
		s.dry();
	}
	public void dry() throws Throwable
	{ 
		File f1=new File("d:\\trx.txt");
		FileReader fr=new FileReader(f1);
int a=10;
int b=11;
if(b>a)
{
	throw new ArithmeticException();
}

}
}
