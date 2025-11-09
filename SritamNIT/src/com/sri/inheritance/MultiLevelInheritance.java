package com.sri.inheritance;

class Student{
	protected int id;
	protected String name;
	protected String address;
	
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
class Science extends Student{
	protected int phy;
	protected int chem;
	public Science(int id, String name, String address, int phy, int chem) {
		super(id, name, address);
		this.phy = phy;
		this.chem = chem;
	}
	@Override
	public String toString() {
		return super.toString()+"Science [phy=" + phy + ", chem=" + chem + "]";
	}	
}
class PCM extends Science{
	protected int math;

	public PCM(int id, String name, String address, int phy, int chem, int math) {
		super(id, name, address, phy, chem);
		this.math = math;
	}

	@Override
	public String toString() {
		return super.toString()+"PCM [math=" + math + "]";
	}
	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		PCM pcm = new PCM(101,"Sritam","anadeula",76,53,31);
         System.out.println(pcm);
	}

}
