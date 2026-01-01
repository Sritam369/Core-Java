package com.sri.exception_handling;

	public class NumberFormatAndNullPointerException {
	    public static void main(String[] args) {
	        String msg = IO.readln("enter value");
	        try{
	        InvalidSensorException.process(msg);
	        }
	        catch(InvalidSensorException e){
	            IO.println(e.getMessage());
	        }
	        
	    }
	}
	class InvalidSensorException extends Exception{
	    public InvalidSensorException(String str){
	        super(str);
	    }
	    public static void process(String data) throws InvalidSensorException{
	        if(data=="null" || data.isEmpty() || data.isBlank()){
	            throw new InvalidSensorException("Exception: Invalid sensor data Caused by: java.lang.NullPointerException");
	        }
	        else{
	            try{
	            int x = Integer.valueOf(data);
	            IO.println("Transaction Parsed Successfully");
	            }
	            catch(NumberFormatException e){
	              IO.println(e);
	            }
	        }
	    }
	}

