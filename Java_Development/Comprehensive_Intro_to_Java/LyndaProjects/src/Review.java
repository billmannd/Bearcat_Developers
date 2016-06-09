import java.util.Scanner; 

public class Review {
	
	
	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		System.out.println(mc.myNum);
		System.out.println("Enter 1st number: ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = scan.nextInt();
		System.out.println("Sum is " + (num1 +  num2));
		
		mc.myMethod();
	}

}
