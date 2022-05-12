package com.chainsys.variables;
/**
 * @author chainsys-poobalan
 *created on :25 march 2022
 */
public class Calculator {
/**
 * Add method: will take 2 integer values the follwing parameters
 * and will add the values.the result of totalling will be returned as
 * This a static method, object reerence is not required.
 * @param param1 of type int
 * @param para2 of type int
 * @return type int
 * 
 * 
 */
	public static int add(int param1, int param2)
	{
		int result=param1+param2;
		return result;
	}
	/**
	 * divide method: will take 2 integer values the follwing parameters
	 * and will add the values.the result of totalling will be returned as
	 * This a static method, object reerence is not required.
	 * @param param1 of type int
	 * @param para2 of type int
	 * @return type int
	 * 
	 * 
	 */
		public static int divide(int param1, int param2)
		{
			if(param2==0) {
				System.out.println("value cannot be zero");
		}
		int result=param1/param2;
		return result;
		
		}
		/**
		 * multiple method: will take 2 integer values the follwing parameters
		 * and will multiple the values.the result of totalling will be returned as
		 * This a static method, object reerence is not required.
		 * @param param1 of type int
		 * @param para2 of type int
		 * @return type int
		 * 
		 * 
		 */
			public static int multiple(int param1, int param2)
			{
				int result=param1*param2;
				return result;
			}
			
			/**
			 * substract method: will take 2 integer values the follwing parameters
			 * and will substract the values.the result of totalling will be returned as
			 * This a static method, object reerence is not required.
			 * @param param1 of type int
			 * @param para2 of type int
			 * @return type int
			 * 
			 * 
			 */
				public static int substract(int param1, int param2)
				{
					int result=param1-param2;
					return result;
				}
			
}
