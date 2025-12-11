
class Employee{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object obj) { 
		// retrieve the first object value
		
		int id1 = this.id; // e1.id
		String name1 = this.name; //e1.name
		
		// retrieve the second object data
		Employee e2 = (Employee)obj;
		int id2 = e2.id;
		String name2 = e2.name;
		
		if(id1==id2 && name1.equals(name2)) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return this.id;
	}
}

public class OverridingEqualsMethod {

	public static void main(String[] args) {
		Employee e1 = new Employee(111,"sritam1");
		Employee e2 = new Employee(111,"sritam2");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
	}

}
