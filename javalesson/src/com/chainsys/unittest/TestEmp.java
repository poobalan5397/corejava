package com.chainsys.unittest;
import com.chainsys.Collections.Emp;
import com.chainsys.Collections.Emp;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp firstEmp=new Emp(111);
Emp secondEmp=new Emp(102);
System.out.println(firstEmp.hashCode());
System.out.println(secondEmp.hashCode());
boolean result=firstEmp.equals(secondEmp);
System.out.println(result);
result=firstEmp.equals(firstEmp);
System.out.println(result);
result=firstEmp.equals("hello");
System.out.println(result);

	}

}
