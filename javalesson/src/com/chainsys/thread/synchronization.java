package com.chainsys.thread;

public class synchronization {
	public int amount=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public synchronized void callme()

	{
		long id =Thread.currentThread().getId();
		amount=0;
		System.out.println("Inside callme ThreadID"+id+"Amount"+amount);
		try
		{
			for(int i=0;i<5;i++)
			{
				
			}
		}
		
	}
}
