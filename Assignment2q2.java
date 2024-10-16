import java.util.Scanner;

public class Assignment2q2 {

	
	
	public static void menu(){
		
		System.out.println("Enter 1 for Dosa Rs. 40");
		System.out.println("Enter 2 for Samosa Rs. 15");
		System.out.println("Enter 3 for Idli Rs. 10");
		System.out.println("Enter 4 for Vada Rs. 15");
		System.out.println("Enter 5 for Poha Rs. 25");
		System.out.println("Enter 6 for Upma Rs. 30");
		System.out.println("Enter 7 for Uttapa Rs. 50");
		System.out.println("Enter 8 for French Fries Rs. 60");
		System.out.println("Enter 9 for Burger Rs. 45");
		System.out.println("Enter 10 to Generate Bill");
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int bill = 0;
		int n = 0;
		while(n != 10) {
			menu(); 
			System.out.println("Enter number to buy food");
			 n = scn.nextInt();
			
			switch(n) {
			case 1:
			    System.out.println("You've puchased Dosa");	
			    bill = bill + 40;
			    break;
			case 2:
				System.out.println("You've puchased Samosa");
				 bill = bill + 15;
				 break;
			case 3:
				System.out.println("You've puchased Idli");
				 bill = bill + 10;
				 break;
			case 4:
				System.out.println("You've puchased Vada");
				 bill = bill + 15;
				 break;
			case 5:
				System.out.println("You've puchased Poha");
				 bill = bill + 25;
				 break;
			case 6:
				System.out.println("You've puchased Upma");
				 bill = bill + 30;
				 break;
			case 7:
				System.out.println("You've puchased Uttapa");
				 bill = bill + 50;
				 break;
			case 8:
				System.out.println("You've puchased French Fries");
				 bill = bill + 60;
				 break;
			case 9:
				System.out.println("You've puchased Burger");
				 bill = bill + 45;
				 break;
			case 10:
				System.out.println("Your total bill is: " + bill);
				 break;	
			}
		}
		scn.close();
	}

		
}
