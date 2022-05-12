package com.chainsys.practice;

public class Studentperformance {
	private final int id ;
	private String name;
	private String group;
	private String location;
	public int getid()
	{
	return id;
	}
	public Studentperformance(int ids)
	{
		id=ids;
	}
public String getName()
{
	return name;
}
public void setName(String names)
{
	this.name=names;
}
	public String getgroup()
	{
		return group;
	}
	public void setgroup(String gro)
	{
		group=gro;
	}
	public String getlocation()
	{
		return location;
	}
	public void setlocation(String loc)
	{
		location=loc;
	}	
}
