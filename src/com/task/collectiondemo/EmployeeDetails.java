package com.task.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDetails {

	public static void main(String[] args) {

		ArrayList<Employee> array = new ArrayList<Employee>();

		array.add(new Employee(2, "Prashant", 28));
		array.add(new Employee(1, "Laxman", 38));
		array.add(new Employee(3, "Sunil", 18));

		Collections.sort(array, new SortByEmpId());

		System.out.println("Sorting based on empID");

//		for (int i = 0; i < array.size(); i++) {
//
//			System.out.println(array.get(i));
//
//		}
		
		for(Employee em : array) {
			System.out.println(em);
			
		}
		
	
	}

}
