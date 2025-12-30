
class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class ArrayForCustomClassObject {
  void main() {
	  int size = Integer.parseInt(IO.readln("enter size"));
	   Employee arr[]=new Employee[size];
	   IO.println("Enter number for employees: "+size);
	   int c=1;
	   for(int i=0;i<size;i++) {
		   IO.println("Enter details for employees: "+c); 
		   int id = Integer.parseInt(IO.readln("enter id"));
		   String name = IO.readln("enter name");
		   double sal = Double.parseDouble(IO.readln("enter salary"));
		   Employee e = new Employee(id,name,sal);
		   arr[i]=e;	
		   c++;
	   }
	   for(Employee brr:arr) {
		   IO.println(brr);
	   }
  }
}
