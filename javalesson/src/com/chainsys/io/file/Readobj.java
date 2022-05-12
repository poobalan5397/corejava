package com.chainsys.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.chainsys.Collections.Emp;

public class Readobj {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 {
	         FileInputStream fis = 
	                 new FileInputStream("D:\\temp\\emp1.dat") ;
	         ObjectInputStream ois = new ObjectInputStream(fis) ;
	          Emp ob =null;
	         try
	        {
	            ob = (Emp) ois.readObject();
	        }
	        catch(Exception e)
	        {
	            System.out.println("Exception during deserialization: " +e);
	        }
	        finally
	        {
	            try
	            {
	                ois.close();
	            }
	            catch(Exception e)
	            {
	                System.out.println("Exception during ois close: " + e);
	            }
	        }
	        if(null!=ob)
	        {
	        	System.out.println(ob.getID() +" "+ ob.Name);
	            System.out.println("HashCode "+ob.hashCode());            
	        }
	}

}}
