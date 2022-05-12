package com.chainys.firsttest;

public class student {
	String Name;
	int age;
	String department ;
	student(String names,int ag,String dep)
	{
		this.Name=names;
		this.age=ag;
		this.department=dep;
	}
	public void show()
	{
		System.out.println(Name+" "+age+" "+department);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj=new student ("vishal", 24,"cse");
obj.show();
	}

}
