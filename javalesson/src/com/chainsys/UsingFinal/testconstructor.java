package com.chainsys.UsingFinal;
import com.chainsys.UsingFinal.FinalClassDemo;

public class testconstructor {
	public static void testPrivateConstructor() {
		ShapeAPrivateConstructor refShapeA=
				ShapeAPrivateConstructor.getObject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}

}
