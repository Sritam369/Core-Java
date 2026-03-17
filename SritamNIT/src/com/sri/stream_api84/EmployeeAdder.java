package com.sri.stream_api84;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;
    private String gender;

    // Constructor
    public Employee(String name, int age, double salary, String gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters and setters for each variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Override toString() method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
public class EmployeeAdder {

	public static List<Employee> addDetails() 
	{
		List<Employee> list = new ArrayList<>();
		Employee employee1 = new Employee("Anna", 27, 50000.0, "Male");
		Employee employee2 = new Employee("Employee 2", 27, 51000.0, "Female");
		Employee employee3 = new Employee("Bob", 27, 52000.0, "Male");
		Employee employee4 = new Employee("EmplSmithoyeeee 4", 28, 53000.0, "Female");
		Employee employee5 = new Employee("Employee 5", 29, 53000.0, "Male");
		Employee employee6 = new Employee("Employee 6", 30, 55000.0, "Female");
		Employee employee7 = new Employee("EmSmithployee 7", 31, 56000.0, "Male");
		Employee employee8 = new Employee("Employee 8", 32, 57000.0, "Female");
		Employee employee9 = new Employee("Employee 9", 35, 58000.0, "Male");
		Employee employee10 = new Employee("EMPLOYEEeeseeee 10", 35, 59000.0, "Female");

		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);
		return list;

		
		
		
	}
	
	void main() {
		List<Employee>list = EmployeeAdder.addDetails();
		//1. Filter employees by gender
		list.stream().filter(emp->emp.getGender().equalsIgnoreCase("female")).forEach(IO::println);
		IO.println("===============================");
		//2. Filter employees by age older than 30
		list.stream().filter(emp->emp.getAge()>30).forEach(IO::println);
		IO.println("===============================");
		//3. Filter employees by salary>50000
		list.stream().filter(emp->emp.getSalary()>50000).forEach(IO::println);
		IO.println("===============================");
		//4. Create a list of employee names
		List<String>name=list.stream().map(e->e.getName()).collect(Collectors.toList());
	    IO.println(name);
	    IO.println("===============================");
	    //5. Calculate avg salary
	    OptionalDouble avg = list.stream().mapToDouble(e->e.getSalary()).average();
	    avg.ifPresent(IO::println);
	    IO.println("===============================");
	    //6. Find max salary
	    OptionalDouble max = list.stream().mapToDouble(e->e.getSalary()).max();
	    max.ifPresent(IO::println);
	    IO.println("===============================");
	    //7. Group employees by gender
	   Map<String,List<Employee>>map= list.stream().collect(Collectors.groupingBy(e->e.getGender()));
	   IO.println(map);
	   IO.println("===============================");
	   //8. Count male employees 
	   Long count = list.stream().filter(e->e.getGender().equalsIgnoreCase("male")).count();
	   IO.println(count);
	   IO.println("===============================");
	   //9. sum of all salaries 
	   double sum = list.stream().mapToDouble(e->e.getSalary()).sum();
	   IO.println(sum);
	   IO.println("===============================");
	   //10. sort employees by name
	   List<Employee> sort = list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).toList();
	   IO.println(sort);
	   IO.println("===============================");
	   //11. sort employees by age
	   list.stream().sorted((e1,e2)->Integer.compare(e1.getAge(), e2.getAge())).forEach(IO::println);
	   IO.println("===============================");
	   //12. sort employees by salary
	   list.stream().sorted((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())).forEach(IO::println);
	   IO.println("===============================");
	   //13. Find oldest employee
	   int maxAge = list.stream().mapToInt(e->e.getAge()).max().orElse(0);
	   list.stream().filter(e->e.getAge()==maxAge).forEach(IO::println);
	   IO.println("===============================");
	   //14. Group employees by age
	   Map<String,List<Employee>> map2 = list.stream().collect(Collectors.groupingBy(e->{
		   int age = e.getAge();
		   if(age>=20 && age<=30) {
			   return "20-30";
		   }
		   else if(age>=31 && age<=40) {
			   return "30-40";
		   }
		   else {
			   return "40+";
		   }
	   }));
	   
	   map2.forEach((k,v)->IO.println(k+" "+v));
	   IO.println("===============================");
	 //15. Find employees with a specific age 35
	   list.stream().filter(e->e.getAge()==35).forEach(IO::println); 
	   IO.println("===============================");
	  //16. calculate the sum of salaries based on gender
	   list.stream().collect(Collectors.groupingBy(e->e.getGender())).forEach((k,v)->{
		   double sum2=0;
		   for(Employee value:v) {
			   sum2+=value.getSalary();
		   }
		   IO.println("sum of salary of "+k+" :"+sum2);
	   });
	                 //(OR)
	   list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.summingDouble(Employee::getSalary))).
	   forEach((k,v)->IO.println(k+" "+v));	   
	   IO.println("===============================");
	 //17. Find employees whose name starts with j
	   list.stream().filter(e->e.getName().startsWith("E")).forEach(IO::println); 
	   IO.println("===============================");
	  //18. Calculate average salary for male and female
	   list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).forEach((k,v)->IO.println(k+" "+v));
	   IO.println("===============================");
	  //19. Find top 5 highest paid employees
	   list.stream().sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())).limit(5).forEach(IO::println);
	   IO.println("===============================");
	  //20. Retrieve distinct age values
	   List<Employee>list2 = list.stream().filter(e->e.getAge()==27).toList();
	   list2.forEach(IO::println);
	   IO.println("===============================");
	  //21. Find the 3 lowest paid employee names
	   list.stream().sorted((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())).limit(3).map(e->e.getName()).forEach(IO::println);
	   IO.println("===============================");
	  //22. Sort employees by name length
	   list.stream().sorted((e1,e2)->Integer.compare(e1.getName().length(), e2.getName().length())).forEach(IO::println);
	   IO.println("===============================");
	  //23. Group employees by age
	    Map<String,List<Employee>> map3 = list.stream().collect(Collectors.groupingBy(e->{
		   int age = e.getAge();
		   if(age>=20 && age<=30) {
			   return "20-30";
		   }
		   else if(age>=31 && age<=40) {
			   return "30-40";
		   }
		   else {
			   return "40+";
		   }
	   }));
	    IO.println("===============================");
	  //24. Find avg salary of employess with age<=30
	    double avg2 =list.stream().filter(e->e.getAge()<=30).mapToDouble(e->e.getSalary()).average().orElse(0.0);
	    IO.println(avg2);
	    IO.println("===============================");
	  //25. Find name of male employees with salary over 55000
	    list.stream().filter(e->e.getGender().equalsIgnoreCase("male") && e.getSalary()>55000).map(e->e.getName()).forEach(IO::println);
	    IO.println("===============================");
	  //26. Find the youngest female employees
	    list.stream().filter(e->e.getGender().equalsIgnoreCase("female")).sorted((e1,e2)->Double.compare(e1.getAge(), e2.getAge())).limit(1).forEach(IO::println);
	    IO.println("===============================");
	  //27. Retrieve the names of employees in reverse order
	    List<String> collect = list.stream().map(e->e.getName()).collect(Collectors.toList());
	    Collections.reverse(collect);
	    IO.println(collect);
	    IO.println("===============================");
	  //28. Find highest salary among females
	    list.stream().filter(e->e.getGender().equalsIgnoreCase("female")).sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())).limit(1).forEach(IO::println);
	    IO.println("===============================");
	  //29. Group employees by age and gender
	    Map<String, Map<Integer, List<Employee>>> collect2 = list.stream()
	    		.collect(Collectors.groupingBy(Employee::getGender,Collectors.groupingBy(Employee::getAge)));

	    		collect2.forEach((key,value)->
	    		{
	    			IO.println(key+"-"+value);
	    		});
	    IO.println("===============================");
	  //30. Find the Sum of Salaries for Employees with Names Containing "Bob"
	    double sum2 = list.stream().filter(e->e.getName().equalsIgnoreCase("bob")).mapToDouble(e->e.getSalary()).sum();
	    IO.println(sum2);
	    IO.println("===============================");
	  //31. Find the Names of Employees Aged 30-40 with Salaries Between 50,000 and 60,000:
	    list.stream().filter(e->e.getSalary()>=50000 && e.getSalary()<=60000 && e.getAge()>=30 && e.getAge()<=40).forEach(IO::println);
	    IO.println("===============================");
	  //32. Calculate total no. of employees
	    long count2 = list.stream().count();
	    IO.println(count2);
	    IO.println("===============================");
	  
	}

}