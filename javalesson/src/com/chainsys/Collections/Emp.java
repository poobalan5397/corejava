package com.chainsys.Collections;

import java.io.Serializable;

public class Emp implements Serializable {
	private final int id;
	public String Name;
	public Emp(int v1,String n)
	{
		id=v1;
		Name=n;
//		System.out.println("valueis"+id);
	}
	public int getID()
	{
		return id;
	}
	
	public String getnames()
	{
		return Name;
	}
	
	
	
	@Override
	public boolean equals(Object obj)
	{
		Class c1=obj.getClass();
		System.out.println(c1);
		System.out.println(this.getClass());
		boolean flag=false;
		if(c1==this.getClass())
		{
			Emp other=(Emp) obj;
			if(this.hashCode()==obj.hashCode())
			flag=true;
			
		}
	
	return flag;
	}
	/*public int hashCode()
	{
		return this.id;
		}*/
	}
	


