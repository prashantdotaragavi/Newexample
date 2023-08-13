package com.task.collectiondemo;

public class Employee {
	int empid;
	String name;
	int age;

	public Employee(int empid, String name, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + "]";
	}

}
