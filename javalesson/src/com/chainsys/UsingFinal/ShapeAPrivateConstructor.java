package com.chainsys.UsingFinal;


public class ShapeAPrivateConstructor {
	public int height;
	public int width;

	private ShapeAPrivateConstructor()
	{
		System.out.println("ShapeA crreaedA"+hashCode());
	}
	private ShapeAPrivateConstructor(int x)
	{
		height=x;
		width=x;
		System.out.println(x+"shapeaA createdB"+hashCode());
	}
	public void echo()
	{
		System.out.println("shapeAECHO....");
		System.out.println("hai");
	}
	public static ShapeAPrivateConstructor getObject()
	{
		return new ShapeAPrivateConstructor();
	}
}
