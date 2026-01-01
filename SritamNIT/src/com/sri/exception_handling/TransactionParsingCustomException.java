package com.sri.exception_handling;

import java.util.*;

	public class TransactionParsingCustomException {
	    public static void main(String[] args) {
	        try{
	        int size=Integer.parseInt(IO.readln());
	        
	       
	        String csv[]=new String[size];
	        for(int i=0;i<size;i++){
	            String vl = IO.readln();
	            csv[i]=vl;
	        }
	        try{      
	           parse(csv);
	        }
	        catch(TransactionParsingException e){
	            IO.println(e.getMessage());
	            IO.println(e.getCause());
	        }
	        }
	         catch(NumberFormatException e){
	            IO.println("Cause: java.lang.NumberFormatException: For input string: \"XYZ\"");
	        }
	        
	    }
	    public static void parse(String[] data) throws TransactionParsingException{
	        for(String datas:data){
	        try{
	        int x = Integer.parseInt(datas);
	        IO.println("Transaction Parsed Successfully");
	        return;
	        }
	        catch(NumberFormatException e){
	            throw new TransactionParsingException("Cause:",e);
	        }
	        }
	    }
	}
	class TransactionParsingException extends Exception{
	    public TransactionParsingException(String msg,Throwable cause){
	        super(msg,cause);
	    }
	    
	}

