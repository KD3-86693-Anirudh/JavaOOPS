import java.util.Scanner;

public class Assignment2q1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();

		String binaryString = Integer.toBinaryString(n);
		System.out.println("binary number: " + binaryString);

		String octalString = Integer.toOctalString(n);
		System.out.println("Octal number: " + octalString);

		String hexString = Integer.toHexString(n);
		System.out.println("Hexadecimal number: " + hexString);
			
		scn.close();
	}

}
