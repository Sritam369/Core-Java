package com.exam.nit;

public class Reservation {
private String name;
private int seats;
private int days;
private static int availableSeats=100;
private Reservation(String name, int seats, int days) {
	super();
	this.name = name;
	this.seats = seats;
	this.days = days;
}
public int avail() {
	return availableSeats-seats;
}
public String status() {
	if(days>=5) {
		return "CONFIRMED\n"+
	"Your ticcket is confirmed!";
	}
	else if(days<=5 && days>=2) {
		return "RAC\n"+
	"You are on RAC list. Wait for confirmation.";
	}
	else {
		return "FAILED\n"+
	"Your booking failed. Deducted amount will be returned to you within 4 to 5 working days.";
	}
}
@Override
public String toString() {
	return "Reservation [name=" + name + ", seats=" + seats + ", days=" + days + ", Booking Status= "+status()+", Remaining seats="+avail()+"]";
}
public static Reservation res(String name,int seats,int days) {
	return new Reservation(name,seats,days);
}
}
