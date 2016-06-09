package chapter2;

import java.util.Scanner;



public class average {
	public static void main(String[] args) {
		// create scanner
		// import scanner at the top
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter 5 numbers
		double one = input.nextDouble();
		double two = input.nextDouble();
		double three = input.nextDouble();
		double four = input.nextDouble();
		double five = input.nextDouble();
		
		double avg = (one + two + three + four + five)/5.0;
		
		// display results
		
		System.out.println("The average of the inputs is " + avg);
		
	}
}
