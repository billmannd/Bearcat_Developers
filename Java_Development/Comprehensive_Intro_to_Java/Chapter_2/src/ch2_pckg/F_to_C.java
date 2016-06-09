/* Here we will create a calculator that converts
 * temperatures from Degrees Fahrenheit to Degrees Celsius */ 
 

package ch2_pckg;

import java.util.Scanner;

public class F_to_C {
	public static void main(String[] args) {
		// declare a new scanner
		Scanner in = new Scanner(System.in);
	
		System.out.println("Please enter a degree in Fahrenheit: ");
		
		double f = in.nextDouble();
		
		// convert Fahrenheit to celsius
		double c = ((f  - 32) * 5 ) / 9 ;
	
		System.out.println(f + " degrees Fahrenheit is equal to " + c + " degrees celsius");
		
		in.close();
	}
}
