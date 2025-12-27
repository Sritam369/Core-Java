package com.sri.exception_handling;

public class CarUserCustomException {
  void main() {
	  try {
		  String msg=IO.readln("enter message for car stopping");
		  CarTest.stop(msg); 
		  String punctureMsg=IO.readln("enter message for car puncture");
		  CarTest.puncture(punctureMsg); 
		  int heat = Integer.parseInt(IO.readln("enter car heat"));
		  CarTest.carHeat(heat);
	  }
	  catch(Exception e) {
		 IO.println(e.getMessage());
	  }
  }
}
class CarStoppedException extends Exception{
	public CarStoppedException(String x) {
		super(x);
	}	
}

class CarPunctureException extends Exception{
	public CarPunctureException(String x) {
		super(x);
	}
}

class CarHeatException extends Exception{
	public CarHeatException(String x) {
		super(x);
	}	
}

class CarTest {
	public static void stop(String x) throws CarStoppedException  {
		if(x.equalsIgnoreCase("stop")) {			
		     throw new CarStoppedException("car stopped for some reason");
	}
		else {
			IO.println("car not stalled");
		}
	}
		public static void puncture (String x) throws CarPunctureException{
		if(x.equalsIgnoreCase("puncture")) {
				throw new CarPunctureException("car is punctured");		
		}
		else {
			IO.println("car not punctured");
		}
		}
		public static void carHeat(int x) throws CarHeatException{			
			if(x>50) {
				
					throw new CarHeatException("car is heated more than 50 degree celsius");
			}
			else {
				IO.println("car temperature normal");
			}
		}
	}





