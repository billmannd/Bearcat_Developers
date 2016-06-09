package ch2_pckg;

import java.util.Scanner;

public class SalesTax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// prompt the user for what the cost of the item(s) is.
	System.out.println("What is the total cost of the item or items?");
		
	// find out how much the item costs
	// requires user input and a new variable
			
	double itemCost = in.nextDouble();
	
	// ask how much sales tax is
	
	System.out.println("What is the sales tax for sales tax? your answer should be given as a percentage integer.");
	System.out.println("For example, an input of '10' would mean 'ten percent'.");
	
	
	double salesTax = in.nextDouble();
	salesTax = salesTax /100;
	salesTax += 1;
	
	double totalCost =  itemCost * salesTax;

	System.out.println("The total item cost after tax is $" + totalCost);
		
	}
}
