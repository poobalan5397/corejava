package com.chainsys.io.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.chainsys.Collections.Emp;

public class Writeobj {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		 {
			    FileOutputStream fos =null;
			    ObjectOutputStream oos =null;
			    java.util.Scanner scanner=null;
			    try
			    {
			        fos=new FileOutputStream ("d:\\temp\\emp1.dat") ;
			        oos=    new ObjectOutputStream(fos) ;
			         scanner=new java.util.Scanner(System.in);
			        System.out.println("Enter Emp ID");
			        String sid=scanner.nextLine();
			        System.out.println("Enter EmpName");
			        String sName=scanner.nextLine();        
			        Emp firstemp  =  new Emp(Integer.parseInt(sid), sName) ;        
			        oos.writeObject(firstemp) ;
			        oos.flush();
			        System.out.println("Emp Object Saved "+firstemp.hashCode());
			    }
			    catch(Exception e)
			    {
			        System.out.println("Exception during serialization: " + e);
			    }
			    finally
			    {
			        try
			        {
			            oos.close();
			            scanner.close();        }
			        catch(Exception e)
			        {
			            System.out.println("Exception during oos.close: " + e);
			        }
			    }
	}

}
}