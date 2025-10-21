package com.sri.blc;

public class Customer {
int customerId;
String customerName;
public void setCustomerData(int cid, String cname) {
	customerId=cid;
	customerName=cname;
}
public void getCustomerData() {
	System.out.println("cusomer id is "+customerId);
	System.out.println("customer name is "+customerName);
}
}
