package edu.lessons.days60.oops.Interface;

public class test {
	public static void testVehicle()
	{
		IVechile v1;//=new IVehicle();
		v1=new VehicleCar();
		v1.echo();
		v1.start();
		v1.stop();
		//v1.park();
		// type cast the Object to the Car class
		VehicleCar c1=(VehicleCar)v1;			
		c1.park();
		v1 = new VehicleShip();
		v1.echo();
		v1.start();
		v1.stop();
	}
}
