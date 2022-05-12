package com.chainsys.practice;

public class college {
	void department()
	{
		System.out.println("cse");
	}}
	class management extends college
	{
		void project()
		{
			System.out.println("IOT");
		}
	}
	class mech extends management
	{
		void review()
		{
			System.out.println("completed");
		}}
	
class st{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
mech obj=new mech();
obj.review();
	}}


