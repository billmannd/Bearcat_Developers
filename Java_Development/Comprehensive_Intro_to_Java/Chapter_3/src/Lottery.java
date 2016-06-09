import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// We're going to play the lottery! It will consist of 2 numbers, you're going to try to get it exactly right. 
		// make a random number: 
		
		int lotto = (int)(Math.random() * 100);
		
		//create scanner so user can guess
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your two-digit lottery pick number. No spaces please: ");
		int guess = in.nextInt();
		
		// Get digits from lottery
		int lottery1 = lotto / 10;
		int lottery2 = lotto % 10; 
		
		// get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lotto);
		
		if (lotto == guess)
			System.out.println("Exact match! Fuckin A dude!");
		else if (guessDigit2 == lottery1 && guessDigit1 == lottery2)
			System.out.println("Match all digits, pretty good!");
		else if (guessDigit1 == lottery1 || guessDigit2 == lottery2 || guessDigit1 == lottery2 || guessDigit2 == lottery1)
			System.out.println("Match one digit: you win some things!");
		else
			System.out.println("Suck a dick, you idiot.");
		
	}

}
