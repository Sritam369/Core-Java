package com.sri.method_overriding;

class Vehicle5
{
	public int fuelCapacity()
	{
		return 40;
	}	
	
	public void printTankCapacity()
	{
		System.out.println(fuelCapacity());
	}
}
class Car5 extends Vehicle5
{
	@Override
	public int fuelCapacity()
	{
		return 18;
	}	
	public void printTankCapacity()
	{
		System.out.println(super.fuelCapacity());
	}
}

public class Test
{

	public static void main(String[] args)
	{
		Vehicle5 v1 = new Car5();
		v1.printTankCapacity();

	}

}

