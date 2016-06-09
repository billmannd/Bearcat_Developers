import java.util.Scanner; 

public class SimpleIfDemo {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		int num = in.nextInt();
		
		if (num % 5 == 0) 
			System.out.println("This number is evenly divisible by 5.");
		
		if (num % 2 == 0)
			System.out.println("This is an even number!");
		else 
			System.out.println("This number is neither even nor divisible by 5.");
		
	}
	
	
}
