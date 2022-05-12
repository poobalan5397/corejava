package edu.lessons.days60.oops.Interface;

public class VehicleShip extends VehicleAbstract {
	@Override
	public void echo() {
		System.out.println("Ship.Echo");
	}
	@Override
	public void move() 
	{
		System.out.println("Ship.Move");
	}
	@Override
	public void stop() {
		System.out.println("Ship.Stop");
	}

}
