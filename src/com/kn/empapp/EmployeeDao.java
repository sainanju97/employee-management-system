package com.kn.empapp;

public interface EmployeeDao {
	//create employee
	public void createEmployee();
	//show all employee
	public void showAllEmployee();
	//show employee based On Id
	public void showEmployeeBasedOnId(int id);
	//update employee
	public void updateEmployee(int id,String name);
	//delete employee
	public void deleteEmployee(int id);

}
