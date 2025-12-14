package com.sri.inner_class;

class Laptop{
	private String brand;
	private String model;
	private Motherboard motherboard;
	
	public Laptop(String brand, String model, String motherboardModel,String chipset) {
		this.brand=brand;
		this.model=model;
		this.motherboard = new Motherboard( motherboardModel, chipset);
	}
	
	public void switchOn() {
		System.out.println("Turning on "+brand+" "+model);
		this.motherboard.boot();
	}
	
	private class Motherboard{
		String motherboardModel;
		String chipset;
		
		public Motherboard(String motherboardModel, String chipset) {
			super();
			this.motherboardModel = motherboardModel;
			this.chipset = chipset;
		}
		
		public void boot() {
			System.out.println("Booting "+brand+" "+model+" with "+chipset+" chipset");
		}
		
	}
}


public class LaptopAndMotherboard {

	public static void main(String[] args) {
		Laptop l = new Laptop("hp","15s","IRIS","intel");
		l.switchOn();

	}

}
