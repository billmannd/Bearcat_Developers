package chapter2;

public class ComputeArea {
	public static void main(String[] args) {
		//final double means things will be a constant
		final double PI = 3.14159;
		
		// declare radius as a double
		double radius;
		// declare area as a double
		double area;
		
		// Assign a radius
		radius = 3; // radius is now 20! Woop!
		
		// Assign an area
		area = (radius * radius) * PI;
				
		// Step 3: Display the area
		System.out.println("The area for the circle with the radius " + radius + " is " + area);
	}
}
