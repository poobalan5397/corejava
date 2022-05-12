package com.chainsys.inheritance;

public class phone {
	public void makeACall()

	{
		System.out.println("call made...");
		
	}
	class Nokia extends phone
	{
		@Override
		public void makeACall()
		{
			System.out.println("call");
		}
	}
}
