package com.sri.method_overriding;
import java.util.Scanner;
class BankAccount{
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    public static final String IFSC_CODE = "SBIHYD151285";
    public BankAccount(String accountHolderName,String accountNumber,double balance){
        if(accountHolderName.isEmpty()){
            System.out.println("account holder name can't be empty");
            System.exit(0);
        }
        else{
        this.accountHolderName=accountHolderName;
        }
        this.accountNumber=accountNumber;
        if(balance>0){
        this.balance=balance;
        }
        else{
            System.out.println("Balance cannot be negative.");
            System.exit(0);
        }

    }
    public void calculateInterest(){
        System.out.println("Interest must be paid");
    }
    public void display(){
    	System.out.println("Account Holder: "+this.accountHolderName);
    	System.out.println("Account Number: "+this.accountNumber);
    	System.out.println("Balance RS :"+this.balance);
    	System.out.println("IFSC CODE :"+this.IFSC_CODE);
    }
 }
class SavingsAccount extends BankAccount{
    protected double interestRate=4.0;
    public SavingsAccount(String accountHolderName,String accountNumber,double balance){
        super(accountHolderName,accountNumber,balance);
    }
    public void calculateInterest(){
        double interest =balance*4.0/100;
        System.out.println("Savings Account Interest RS :"+interest); 
    }
 }
class CurrentAccount extends BankAccount{
    protected double overdraftLimit=5000.0;
    public CurrentAccount(String accountHolderName,String accountNumber,double balance){
        super(accountHolderName,accountNumber,balance);
    }
    public void calculateInterest(){
    	System.out.println("Current accounts do not earn interest.");
    }
    public void checkOverdrafTLimit(){
    	System.out.println("Overdraft limit RS :"+overdraftLimit);
    }
 }
class FixedDipositAccount extends BankAccount{
	  protected double interestRate=6.5;
	  protected int depositTerm;
	  public FixedDipositAccount(String accountHolderName,String accountNumber,double
	 balance,int depositTerm){
	super(accountHolderName,accountNumber,balance);
    if(depositTerm>0){
    this.depositTerm=depositTerm;
    }
    else{
    	System.out.println("Deposit term must be positive.");
        System.exit(0);
    }
  }
  public void calculateInterest(){
    double interest = (balance*this.interestRate*depositTerm/100);
    System.out.println("Fixed Deposit Interest for "+depositTerm+" years RS :"+interest);
  }
}

public class BankApplication{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter your choice");
		  int choice = sc.nextInt();
		  BankAccount b;
		  if(choice==1){
		  System.out.println("enter your name");
		    String name = sc.next();
		    System.out.println("enter your account number");
		    String accNumber = sc.next();
		    System.out.println("enter your balance");
		    double balance = Double.parseDouble(sc.next());
		    b = new SavingsAccount(name,accNumber,balance);
		    b.display();
		    b.calculateInterest();
		  }
		  else if(choice==2){
			  System.out.println("enter your name");
			String name = sc.next();
			System.out.println("enter your acc number");
		    String accNumber = sc.next();
		    System.out.println("enter your balance");
		    double balance = Double.parseDouble(sc.next());
		    b = new CurrentAccount(name,accNumber,balance);
		    b.display();
		    b.calculateInterest();
		    CurrentAccount c = (CurrentAccount)b;
		    c.checkOverdrafTLimit();
	}
		  else if(choice==3){
			  System.out.println("enter your name");
			    String name = sc.next();
			    System.out.println("enter your acc number");
			    String accNumber = sc.next();
			    System.out.println("enter your balance");
			    double balance = Double.parseDouble(sc.next());
			    System.out.println("enter your years");
			    int term = Integer.parseInt(sc.next());
			    b = new FixedDipositAccount(name,accNumber,balance,term);
			    b.display();
			    b.calculateInterest();
		}
 sc.close();
	}}
