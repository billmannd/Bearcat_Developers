package chapter2;

import java.util.Scanner; //Scanner is in the java.util package

public class Console_Input {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a radius
		System.out.print("Enter a number for radius: ");
		
		double radius = input.nextDouble();
		double area = (radius * radius) * 3.14159;
		
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
		
}
