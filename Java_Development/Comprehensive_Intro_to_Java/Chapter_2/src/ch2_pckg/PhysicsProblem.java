package ch2_pckg;

public class PhysicsProblem {
	public static void main(String[] args ){
		// acceleration is velocity change over time
		
		// set v0 and v1
		double v0 = 99.0;
		
		double v1 = 149.0;
		
		double t1 = 5.5;
		double t2 = 50.9;
		double t3 = 4.5;
		
		double acceleration1 = (v1 - v0) / t1;
		double acceleration2 = (v1 - v0) / t2;
		double acceleration3 = (v1 - v0) / t3;
		
		double avg = (acceleration1 + acceleration2 + acceleration3) / 3;
		
		System.out.println("The average speed is " + avg + " units per distance.");
		
	}

}
	
	