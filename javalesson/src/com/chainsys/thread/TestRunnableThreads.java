package com.chainsys.thread;

public class TestRunnableThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runningMultipleRunnableThreads();
	}
	public static void runningMultipleRunnableThreads()
	{
		try
		  {
			Thread t=Thread.currentThread();
			System.out.println("MainTh ID: " +t.getId() );
			RunnableWorker firstWorker=new RunnableWorker();
			//RunnableWorker secondWorker=new RunnableWorker();
			Thread t1=new Thread(firstWorker);
			//Thread t2=new Thread(secondWorker);
			Thread t2=new Thread(firstWorker);
			Thread t3=new Thread(firstWorker);
			t1.start();//call run
			t2.start();// call run	
			t3.start();
			System.out.println("From Main--END!!!");
		 }
catch(Exception e)
		 {
			 System.out.println("ERROR!!! "+e.getMessage());
	     }
	}

}
