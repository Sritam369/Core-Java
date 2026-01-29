package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Hospital{
	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatments;
	private String contactPerson;
	private 	String contactNumber;
	private String location;
	
	public Hospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber,
			String location) {
		super();
		this.hospitalName = hospitalName;
		this.listOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}

	public int getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}

	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments="
				+ listOfTreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
				+ ", location=" + location + "]";
	}
}

class HospitalService{
	
	ArrayList<Hospital> list = new ArrayList<>();
	
	public int addHospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber,String location) {
		Hospital h = new Hospital(hospitalName,listOfTreatments,contactPerson,contactNumber,location);
		list.add(h);
		int code= (int)(Math.random()*10000);
		h.setHospitalCode(code);
		return code;
	}

	public void getHospitals() {
		HashMap<String,Integer> map = new HashMap<>();		
		for(Hospital h:list) {
		map.put(h.getHospitalName() , h.getHospitalCode());
		}
		map.forEach((hospitalName, hospitalCode) ->IO.println("Hospital name: " + hospitalName + " Hospital code: " + hospitalCode));	
	}
	
	public void getHospitalDetails(int hospitalCode) {
		boolean flag=false;
		for(Hospital h : list) {
			if(h.getHospitalCode()==hospitalCode) {
				flag=true;
				IO.println(h);
			}
		}
		if(!flag) {
			IO.println("hospital code not available");
		}
	}
}


public class HospitalFinder {
   void main() {
	   int s = Integer.parseInt(IO.readln("enter number of hospitals"));
	   HospitalService hs = new HospitalService();	
	   for(int i=0;i<s;i++) {
	   	String hospitalName = IO.readln("Enter hospital name");
	   	List<String> treat = new ArrayList<>();
	   	int size = Integer.parseInt(IO.readln("enter number of treatments"));
	   	for(int j=0;j<size;j++) {
		String listOfTreatments = IO.readln("Enter treatments");		
		treat.add(listOfTreatments);
	   	}
		String contactPerson = IO.readln("Enter name of contact person");
		String contactNumber = IO.readln("Enter number of contact person");
		String location = IO.readln("Enter location");
		Hospital h = new Hospital(hospitalName,treat,contactPerson,contactNumber,location);
		hs.addHospital(hospitalName, treat, contactPerson, contactNumber, location);		
   }
	   hs.getHospitals();
	   int code = Integer.parseInt(IO.readln("Enter hospital code"));
	   hs.getHospitalDetails(code);
   }
}
