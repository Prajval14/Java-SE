package com.cestar.assignment1;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// Declaring Variables
		String name = "";
		int age = 0;
		double annualPay = 0.0;
		
		//Initializing scanner library to get user input
		Scanner sc = new Scanner(System.in);
		
		//User Input
		System.out.print("Please enter your name: ");
		name = sc.nextLine();

		//Validating age
		while(true) {
			System.out.print("Please enter your age: ");
			age = sc.nextInt();
			if(age >= 18 && age <60) {
				break;
			}
			else {
				System.out.println("Please enter valid age between 18 and 60.");
			}
		}
		
		//Validating pay
		while(true) {
			System.out.print("Please enter your annual pay: ");
			annualPay = sc.nextDouble();
			if(annualPay > 0) {
				break;
			}
			else {
				System.out.println("Please enter valid pay.");
			}
		}
		
		//Print output
		System.out.printf("My name is %s, my age is %d and I hope to earn $%.3f per year.", name, age, annualPay);
	}
}
