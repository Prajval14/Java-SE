package com.cestar.arrayoperations;

import java.util.Random;

public class ArrayOperations {

	public static void main(String[] args) {
		 //Declaring an empty array of length 10
		int[] randomArray = new int[10];		 	

		 //Initializing array with 10 random numbers
		Random random = new Random();		 
		for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }

		int arraySum = 0;
		int arrayMax = randomArray[0];
		int arrayMin = randomArray[0];
		float arrayAvg = 0f;	
		
		System.out.println("Display Array: ");
		for (int i = 0; i < randomArray.length; i++) {
			//Displaying the list of elements in array
			System.out.println(randomArray[i]);
			//Calculating the sum of elements of the array
			arraySum += randomArray[i];
			//Finding the highest element in array
			if(randomArray[i] > arrayMax) {
				arrayMax = randomArray[i];
			}
			//Finding the lowest element in array
			if(randomArray[i] < arrayMin) {
				arrayMin = randomArray[i];
			}
		}		 
		
		//Calculating the average of array elements
		arrayAvg = (float) arraySum / randomArray.length;
		
		System.out.println("Sum of Array: " + arraySum);
		System.out.println("Highest Number: " + arrayMax);
		System.out.println("Lowest Number: " + arrayMin);
		System.out.println("Average of Array: " + arrayAvg);
	}
}
