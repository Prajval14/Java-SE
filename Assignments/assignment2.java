package com.cestar.assignment2;

import javax.swing.JOptionPane;

public class PayCalculator {

	public static void main(String[] args) {
		// Declaring Variables
		double HoursWorked = 0;
		double BonusHours = 0;
		int PayRate = 17;
		double BonusPercentage = 150;
		int TaxPercentage = 13;
		double beforeTax = 0;
		double Tax = 0;
		double finalPay = 0;
		
		//Initializing JOPtionPane library to get user input
		String input = JOptionPane.showInputDialog("Please enter hours worked: ");
		
		HoursWorked = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Please enter bonus hours worked: ");

		BonusHours = Float.parseFloat(input);
		
		//Calculating Pay
		beforeTax = (HoursWorked * PayRate) + (BonusHours * (PayRate * BonusPercentage / 100));
		
		//Calculating total tax
		Tax = beforeTax * TaxPercentage / 100;
		
		//Calculating final pay
		finalPay = beforeTax - Tax;
		
		//Converting pay to string format
		String formattedValue = String.format("%.1f", finalPay);
		
		//Print output
		JOptionPane.showMessageDialog(null, "Final Pay: " + formattedValue);
	}
}