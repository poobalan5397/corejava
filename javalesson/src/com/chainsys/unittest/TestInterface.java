package com.chainsys.unittest;
import edu.lessons.days60.oops.Interface.InterfaceB;
import edu.lessons.days60.oops.Interface.InterfaceA;
import edu.lessons.days60.oops.Interface.InterfaceD;
import edu.lessons.days60.oops.Interface.InterfaceCImpl;

public class TestInterface {

	public static void main(String[] args) {
		InterfaceA.echo();
        InterfaceA a1=new InterfaceCImpl();
       // InterfaceCImpl a2=new InterfaceA("h");
        a1.print();
        a1.print("Hello");
	}
}