package edu.lessons.days60.oops.Interface;

public interface InterfaceA {
	void m1();
	void m2();
	void print();
	default void print(String type)
	{
		System.out.println(type);
	}
	static void echo()
	{
		System.out.println("Static Echo");
	}

}
