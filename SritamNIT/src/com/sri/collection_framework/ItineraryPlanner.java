package com.sri.collection_framework;

import java.util.ArrayList;

class Activity{
	private String name;
	private String schedule;
	public Activity(String name, String schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}
	public String getName() {
		return name;
	}
	public String getSchedule() {
		return schedule;
	}
	@Override
	public String toString() {
		return "Activity [name=" + name + ", schedule=" + schedule + "]";
	}
	
}

class Destination{
	private String name;
	ArrayList<Activity> list = new ArrayList<>();
	public Destination(String name) {
		super();
		this.name = name;		
	}
	public void addActivities() {
		String name = IO.readln("Enter activity name");
		String schedule = IO.readln("Enter scheduled time");
		list.add(new Activity(name,schedule));
	}
	public void displayActivities() {
		list.forEach(IO::println);
	}
	@Override
	public String toString() {
		return "Destination [name=" + name + "]";
	}	
}

class Itinerary{
	ArrayList<Destination>list=new ArrayList<>();

	public void addDestination(Destination destination) {	
		list.add(destination);
	}
	public void display() {
		list.forEach(IO::println);
	}
}

public class ItineraryPlanner {
  void main() {
	  int size = Integer.parseInt(IO.readln("Enter how many destinations"));
	  for(int i=0;i<size;i++) {
		  String name = IO.readln("Enter destination name");
		  Destination d = new Destination(name);
		  Itinerary it = new Itinerary();
		  it.addDestination(d);
		  int size2=Integer.parseInt(IO.readln("Enter how many activities"));
		  for(int j=0;j<size2;j++) {
			  d.addActivities();
		  }
		  
		  it.display();
		  d.displayActivities();
	  }	  
  }
}
