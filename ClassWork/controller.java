package com.cestar.controller;

import java.util.Scanner;

import com.cestar.dao.EmpDao;

public class controller {

	EmpDao dao = new EmpDao();
	
	Scanner sc = new Scanner(System.in);
	
	public void display() {
		
		System.out.println("=====================");
		System.out.println("============Welcome to display all records option in our application============");
		System.out.println("============Welcome to display all records option in our application============");
		
		
		//call the dao class method to display all records
		
		System.out.println("========================");
		dao.displayRecs();
		System.out.println("========================");
	}
	public void insert() {
		
		System.out.println("===================================================================");
		System.out.println("============Welcome to display all records option in our application============");
		System.out.println("==================================================================");
		
		//call the dao class method to display all records
		System.out.println("Please enter the id of Employee to insert record: =>");
		
		int id = sc.nextInt();
		
		//consume the space to take input next input as a string for name
		
		sc.nextLine();
		
		System.out.print("please enter the contact of employee to insert record :=>");
		String contact = sc.nextLine();
		
		System.out.print("please enter the city of employee to insert record :=>");
		String city = sc.nextLine();
		
		System.out.print("please enter the contact of employee to insert record :=>");
		String email = sc.nextLine();
		
		// pass these argument to create a new employee record
		
		Employee emp = new Employee(id,name,contact,city,email);
		
		//call the dao class insert method and pass this emp as argumnet
		
		System.out.println("===============================");
		dao.insertRec(emp);
		System.out.println("===============================");
	}

	public void findByID() {
		System.out.println("===============================");
		System.out.print("please enter the id of employee :=>");
		Integer e_id = Int(sc.nextLine());

		emp.
	}
}