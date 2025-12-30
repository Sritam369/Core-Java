package com.sri.array;

public class StudentEnrollmentProcess {
  void main() {
	  
	  Course c[] = new Course[3];
	  c[0]=new Course(1,"Java",35000.0);
	  c[1]=new Course(2,".Net",30000.0);
	  c[2]=new Course(3,"Python",32000.0);
	  
	  Offer o[]=new Offer[2];
	  o[0]=new Offer("Special discount: Get 20% off on all courses!");
	  o[1]=new Offer("Limited time offer: Enroll in any two course and get one course free");
	  	  
	  EducationInstitute e = new EducationInstitute(c,o);
	  
	  String name = IO.readln("enter student name");
	  Student2 s = new Student2(name,e);
	  s.viewCoursesAndFees();
	  s.viewOffers();
	  int id = Integer.parseInt(IO.readln("enter course id to enroll: "));
	  s.enrollInCourse(id);
	  
  }
}

record Course(Integer id,String name,Double fee) {}

record Offer(String offerText) {}

record EducationInstitute(Course[] course,Offer[] offer) {

	public void enrollStudentInCourse(int courseId,String studentName) {
		if(courseId==1) {
			IO.println(""+studentName+" enrolled in: Java");
		}
		else if(courseId==2) {
			IO.println(""+studentName+" enrolled in: .Net");
		}
		else if(courseId==3) {
			IO.println(""+studentName+" enrolled in: Python");
		}
		else {
			IO.println("Course with ID "+courseId+" not found.");
		}
	}
}

record Student2(String name,EducationInstitute institute) {
	public void viewCoursesAndFees() {
		for(Course c: institute.course()) {
			IO.println(c);
		}		
	}
	public void viewOffers() {
		for(Offer o: institute.offer()) {
			IO.println(o.offerText());
		}
	}
	public void enrollInCourse(int courseId) {
		institute.enrollStudentInCourse(courseId, name);
	}
}