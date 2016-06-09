package chapter2;

import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt the user for input
		System.out.print("Please enter an integer: ");
		int seconds = input.nextInt();
//		input.close();
		int minutes = seconds/60; // minutes in seconds
		int remainingSeconds = seconds % 60; // Seconds left
		
		
		System.out.println(seconds + " seconds is " + minutes + " minute(s) and " + remainingSeconds + " seconds.");
		
		
	}
}
