package loopAssignments;

import java.util.Scanner;

public class Decimal_to_Octal {

	public static void main(String[] args) {
		
		System.out.println("Decimal to Octal Conversion :=>");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number :: ");
		int n = sc.nextInt();
		int temp = n;
		int rem = 0;
		String octal = "";
		
		while(temp > 0) {
			rem = temp%8;
			octal = rem+octal;
			temp = temp/8;
		}
		System.out.println("Octal Number is :: "+octal);		
	}

}
