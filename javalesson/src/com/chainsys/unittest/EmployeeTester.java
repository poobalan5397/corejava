package com.chainsys.unittest;
import com.chainsys.classandmethods.Employee;
public class EmployeeTester {
public static void testemployee()
{
	Employee firstEmployee=new Employee(12);
     firstEmployee.setName("poobalan");
     System.out.println(firstEmployee.getName());    
}
public static void testCity()
{
	Employee firstEmployee=new Employee(12);
    firstEmployee.setcity("chennai");
    System.out.println(firstEmployee.getcity());    
}
public static void testSalary()
{
	Employee firstEmployee=new Employee(12);
    firstEmployee.setSalary(5000);
    System.out.println(firstEmployee.getSalary());    
}
}
