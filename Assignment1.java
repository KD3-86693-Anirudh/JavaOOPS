import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First value");
		if(scn.hasNextDouble()) {
			
			double a = scn.nextDouble();
			System.out.println("Enter Second value");
			if(scn.hasNextDouble()) {
			
				double b = scn.nextDouble();
				double avg = (a+b)/2;
				System.out.println("The average is: " + avg);
			} else {
			
				System.out.println("First is a double value but second number is not a double value");
			}
			
		} else {
			
			System.out.println("First is not a double value");
		}
	
	}
	
}
