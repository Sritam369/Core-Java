package com.sri.exception_handling;

class FinancialTransaction{
	public void processTransaction(double amount , long accNumber) {
		try {
			if(amount<=0) {
				throw new IllegalArgumentException();
			}
			IO.println("Processing transaction...");
			IO.println("Transaction successful: Amount Rs."+amount+" transferred to account "+accNumber+"");
		}
		catch(IllegalArgumentException e) {		
			IO.println("amount can't be negative or zero");			
		}
	}
}

public class FinancialTransactionValidation {
  void main() {
	  try {
	  double amount = Double.parseDouble(IO.readln("enter amount"));
	  long accNumber = Long.parseLong(IO.readln("enter account number"));
	  FinancialTransaction f = new FinancialTransaction();
	  f.processTransaction(amount, accNumber);
	  }
	  catch(NumberFormatException e) {
		  IO.println("please enter valid amount");
	  }
	  
  }
}
