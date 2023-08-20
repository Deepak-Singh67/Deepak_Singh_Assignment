package loopAssignments;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number :: ");
		String s = sc.nextLine();
		int length = s.length();
		int decimal = 0;
		
		for (int i = 0; i < length; i++) {
			
			int digit = s.charAt(length-i-1)-'0';
			
			int p = (int) (digit * (Math.pow(2,i)));
			
			decimal += p;
			
		}

		System.out.println("decimal is :: "+decimal);
	}

}
