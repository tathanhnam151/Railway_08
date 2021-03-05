package com.vti.backend;

import java.util.ArrayList;

import com.vti.entity.Department;

public class Exercise4 {
	public ArrayList<Department> departments = new ArrayList<Department>();

	public Department dep1 = new Department(1, "dep1");
	public Department dep2 = new Department(2, "dep2");
	public Department dep3 = new Department(3, "dep3");

	public void addDepartments() {

		Department dep1 = new Department(1, "dep1");
		Department dep2 = new Department(2, "dep2");
		Department dep3 = new Department(3, "dep3");

		departments.add(dep1);
		departments.add(dep2);
		departments.add(dep3);

	}

	public void getIndex(int index) {
		System.out.println(departments.get(index).toString());
	}

}
