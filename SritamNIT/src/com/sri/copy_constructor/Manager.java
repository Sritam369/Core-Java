package com.sri.copy_constructor;

public class Manager {
	private int managerId;
	private String managerName;
	
	public Manager(Employee emp) {
		super();
		this.managerId = emp.getId();
		this.managerName = emp.getName();
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
	
}
