package com.kn.empapp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to employee management application");
		EmployeeDaoImp dao=new EmployeeDaoImp();
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("Enter\n"
					+ "1.for create employee\n"
					+ "2.for show all employee\n"
					+ "3. for all employees with id\n"
					+ "4.for update employee\n"
					+ "5.for delete employee ");
			int ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				dao.createEmployee();
				break;
			case 2:
				dao.showAllEmployee();
				break;
			case 3:
				dao.showEmployeeBasedOnId(ch);
			}
			
		}while(true);
	}

}
