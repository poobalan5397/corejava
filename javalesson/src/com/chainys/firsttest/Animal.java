package com.chainys.firsttest;

 class Animalss {
	String color="white";  
} 
	class Dogs extends Animalss{  
	String color="black";  
	void printColor(){  
	System.out.println(color);//prints color of Dog class  
	System.out.println(super.color);//prints color of Animal class  
	}  }
     class Animal {
	public static void main(String args[]){  
    Dogs d=new Dogs();  
	d.printColor();  
	}}  
