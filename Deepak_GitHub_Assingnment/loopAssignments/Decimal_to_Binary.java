package loopAssignments;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		
		System.out.println("Decimal to Binary Conversion :=>");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number :: ");
		int n = sc.nextInt();
		int temp = n;
		int rem = 0;
		String rev = "";
		
		while(temp > 0) {
			rem = temp%2;
			rev = rem+rev;
			temp = temp/2;
		}
		System.out.println("binary number is :: "+rev);		
	}

}
