import java.util.Scanner; 

public class RandomNum {

	public static void main(String[] args) {
		//1. Generate two random #s using Math.random()
		int firstNum = (int)(Math.random() * 100);
		int secondNum = (int)(Math.random() * 100);
		
		
		
		//2. Create a scanner.
		Scanner in = new Scanner(System.in);
		
		//3. If firstNum < secondNum, swap them
		if (firstNum < secondNum) {
			int fork = firstNum;
			firstNum = secondNum;
			secondNum = fork;
		}
		
		int answer = firstNum - secondNum;
		
		//3. Prompt the user.
		System.out.println("What is the difference between " + firstNum + " and " + secondNum + "? Please enter an integer: ");
		int userInput = in.nextInt();
		
		if (answer == 69)
			System.out.println("Ayo! Score check!");
		
		else if (userInput == answer)
			System.out.println("You are correct! Well done.");
		
		else 
			System.out.println("You are an idiot. The answer is "+ answer + ". Take a lap.");
		
	}

}
