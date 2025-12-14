package com.sri.inner_class;

class Car{
	private String make;
	private String model;
	private Engine engine;
	
	public Car(String make, String model, int horsepower) {
		super();
		this.make = make;
		this.model = model;
		this.engine = new Engine(horsepower);
	}
	
	private class Engine{
		private int horsepower;

		public Engine(int horsepower) {
			super();
			this.horsepower = horsepower;
		}
		
		public void start() {
			System.out.println("engine started! Horsepower : "+horsepower);
		}
		public void stop() {
			System.out.println("engine stopped");
		}
	}
	
	public void startCar() {
		System.out.println("starting "+make+" " +model);
		this.engine.start();
	}
	public void stopCar() {
		System.out.println("stopping "+make+" " +model);
		this.engine.stop();
	}
}


public class CarAndEngineInnerClass {

	public static void main(String[] args) {
		Car myCar = new Car("naxon","ev",1200);
		myCar.startCar();
		myCar.stopCar();

	}

}
