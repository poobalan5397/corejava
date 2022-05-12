package com.chainsys.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws IOException   {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter method case");
		int method = sc.nextInt();
		sc.close();
		
		switch(method)
		{
		case 1:
			System.out.println("Create a new file method");
			createANewFile();
			break;
		
	case 2:
		System.out.println("Create a new file method");
		append();
		break;
	
case 3:
	System.out.println("Create a new file method");
	delete();
	break;

case 4:
	System.out.println("Create a new file method");
	rename();
	break;

case 5:
	System.out.println("Create a new file method");
	read();
	break;

case 6:
	System.out.println("Create a new file method");
	copyFile();
	break;

case 7:
	System.out.println("Create a new file method");
	modifyDataInFile();
	break;

case 8:
	System.out.println("Create a new file method");
	move();
	break;	
}
			
	}
	static  File f0 = new File("D:FileOperationExample.txt");  
	
	
	
	public static  void createANewFile()
	{
		 try {  
             // Creating an object of a file  
             
             if (f0.createNewFile()) {  
                        System.out.println("File " + f0.getName() + " is created successfully.");  
             } else {  
                        System.out.println("File is already exist in the directory.");  
             }  
           } catch (IOException exception) {  
                    System.out.println("An unexpected error is occurred.");  
                     
        }   
	}
	
	
	public static void append() 
	{
		try (  FileWriter f = new FileWriter("D:\\javafiless.txt", true)){
            
            f.append("jkhkjgu ");
         } 
       catch (IOException i) { i.printStackTrace(); }
		
	}
	
	
	
	public static void rename()
	{
		File f1 = new File("D:javafiless.txt");  
		boolean rename=f0.renameTo(f1);
		if(rename==true)
		{
			System.out.println("file name has been changed to: "+rename);
		}
		else 
		{
			System.out.println("file not changed");
		}
		
	}
	
	
	
	public static void delete()
	{      File f2= new File("D:javafiless.txt");
		 if (f2.delete()) {
	            System.out.println("File deleted successfully");
	        }
	        else {
	            System.out.println("Failed to delete the file");
	        }
	}
	
	
	public static void read()
	{
		int charfromfile;
        FileInputStream fin = null;
        String fname = "D:\\javafiless.txt";
        try
        {
           fin = new FileInputStream(fname);
        }
        catch(FileNotFoundException e)
        {
        System.out.println("File Not Found");
        return;
        }
        // checking if data is Available
        try
        {
                System.out.println("Is Data Available " + fin.available());
            }
            catch(IOException e)
            {
                System.out.println("File is Closed " + e.getMessage());
            }
            // reading data from the file
            try
            {
                do
                {
                    charfromfile=fin.read();
                    if(charfromfile !=-1) System.out.println((char)charfromfile);
                }
                while(charfromfile !=-1);
            }
            catch(IOException e)
            {
                System.out.println("Error in read :"+e.getMessage());
            }
            finally
            {
                try
                {
                    if(null!=fin)
                        fin.close();
                }
                catch(IOException e1)
                {
                    System.out.println(e1.getMessage());
                }
            }

	}
	
	
	public static void copyFile()  {
		try (  FileWriter f = new FileWriter("D:\\example.txt", true)){
            
            f.append("jkhkjgu ");
         } 
       catch (IOException i) { i.printStackTrace(); }
    }
   
	
	
	public static void modifyDataInFile() throws IOException {
        FileWriter f = new FileWriter("D:\\javafiless.txt");
        try (FileWriter filewriter = new FileWriter("D:\\javafiless.txt");) {
            f.write("chainsys");
            f.close();
            System.out.println("Modify the file");
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
	
	
	public static void move() throws IOException {
        Path temp = Files.move(Paths.get("D:\\javafiless.txt"),
                Paths.get("D:\\New folder\\javafiless.txt"));
        if (temp != null) {
            System.out.println("moved successfully");
        } else {
            System.out.println("Failed to move the file");
        }
    }

}
