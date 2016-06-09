import java.util.Scanner; 

public class BMICalc {
	
	public static void main(String[] args) {
		// Let's calculate our Body Mass Index!
		// below 18.5 is underweight, 18.5-24.9 is normal, 
		// 25.0-29.9 is overweight and above 30.0 is obese.
		// Use Kilograms (Kg) for weight and meters (m) for height.
		
		Scanner in = new Scanner(System.in);
		
		double height;
		double weight; 
		
		// prompt user to enter imperial height and weight
		System.out.println("How much do you weigh? In lbs: ");
		weight = in.nextInt();
		System.out.println("How tall are you? In inches: ");
		height = in.nextInt();
		
		System.out.println("We have converted your height and weight to the metric system.");
		System.out.println("Please wait.");
		
	
		
		// these values are now constants in the metric system.
		final double kg_lbs = .45359237; 
		final double m_in = .0254;
		
		// convert lbs to kg
		double kgweight = weight * kg_lbs;
		double mheight = height * m_in;
		double bmi = kgweight / (mheight * mheight); 
		
		System.out.println("Your BMI is " + bmi);
		
		if (bmi < 18.5)
			System.out.println("Your BMI is " + bmi + ". You are underweight.");
		else if (bmi < 25)
			System.out.println("Your BMI is " + bmi + ". You are normal weight");
		else if (bmi < 30) 
			System.out.println("your BMI is " + bmi + ". You are overweight.");
		else
			System.out.println("Your BMI is " + bmi + ". You are obese. Pull yourself together.");
		
		
		
	}
}
