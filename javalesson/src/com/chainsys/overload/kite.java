package com.chainsys.overload;

public class kite {
void fly(int distance)
{
	System.out.println("Fly1"+distance);
}
void fly(double time, int speed)
{
	System.out.println("fly1"+time);
	
}
int fly(int time, int speed)
{
	return time*speed;
}
void fall(String time)
{
	System.out.println("fall"+time);
}
int fall(int distance)
{
	System.out.println("fall2"+distance);
	return distance;
}
void glide(double time)
{
	System.out.println("glide 2 "+time);
	
}
}
