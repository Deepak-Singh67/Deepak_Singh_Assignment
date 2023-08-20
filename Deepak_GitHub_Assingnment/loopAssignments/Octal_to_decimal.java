package loopAssignments;

import java.util.Scanner;

public class Octal_to_decimal {

	public static void main(String[] args) {
		System.out.println("Octal to Decimal Conversion :=>");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter octal number :: ");
		String s = sc.nextLine();
		int length = s.length();
		int decimal = 0;
		
		for (int i = 0; i < length; i++) {
			
			int digit = s.charAt(length-i-1)-'0';
			System.out.print(digit+" ");
			int p = (int) (digit * (Math.pow(8,i)));
			
			decimal += p;
			
		}

		System.out.println("decimal is :: "+decimal);
	}

}
