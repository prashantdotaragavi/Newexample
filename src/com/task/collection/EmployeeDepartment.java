package com.task.collection;

public class EmployeeDepartment {
	
	int empid ;
	String name;
	String deptName;
	public EmployeeDepartment(int empid, String name, String deptName) {
		super();
		this.empid = empid;
		this.name = name;
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "EmployeeDepartment [empid=" + empid + ", name=" + name + ", deptName=" + deptName + "]";
	}
	
	

}
