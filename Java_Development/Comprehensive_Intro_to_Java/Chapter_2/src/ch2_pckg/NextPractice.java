package ch2_pckg;

import java.util.Scanner;

public class NextPractice {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// we want to display a line THEN
		System.out.println("What's up my ninja, please print a line: ");
		// have the user to write a line THEN
		String usrInput = in.nextLine();
		// print the line the user wrote
		System.out.println("I wrote this shit: " + usrInput );
	}

}
