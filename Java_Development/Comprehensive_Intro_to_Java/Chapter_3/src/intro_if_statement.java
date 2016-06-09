import java.util.Scanner;

public class intro_if_statement {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What's the radius of the circle in meters? Please print here: ");
		
		double radius = in.nextDouble();
		
		if (radius < 0) {
			System.out.println();
		} else {
			double area = radius * radius * 3.14159;
			System.out.println("Area is " + area + " square meters.");
		}

	}

}
