package com.task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.task.collectiondemo.Employee;


public class EmployeeDeptDetails {

	public static void main(String[] args) {
		
		ArrayList<EmployeeDepartment> array = new ArrayList<EmployeeDepartment>();
		array.add(new EmployeeDepartment(3, "Sunil", "IT"));
		array.add(new EmployeeDepartment(4, "Ajay", "HR"));
		array.add(new EmployeeDepartment(2, "Prashant", "IT"));
		array.add(new EmployeeDepartment(1, "Laxman", "HR"));
		array.add(new EmployeeDepartment(5, "Rudra", "Accounts"));
		

		Collections.sort(array,Comparator
				.comparing((EmployeeDepartment emp) -> emp.deptName)
				.thenComparingInt(emp -> emp.empid));
		
		for (EmployeeDepartment emp : array) {
            System.out.println(emp);


		}
		
		
	}
	
}
