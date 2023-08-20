package loopAssignments;

import java.util.Scanner;

public class Octal_to_Binary {

	public static void main(String[] args) {
		System.out.println("Octal to Octal Conversion :=>");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter octal number :: ");
		String s = sc.nextLine();
		int length = s.length();
		int octal = 0;
		
		for (int i = 0; i < length; i++) {
			
			int digit = s.charAt(length-i-1)-'0';
			System.out.print(digit+" ");
			int p = (int) (digit * (Math.pow(8,i)));
			
			octal += p;
			
		}

		int temp = octal;
		int rem = 0;
		String binary = "";
		
		while(temp > 0) {
			rem = temp%2;
			binary = rem+binary;
			temp = temp/2;
		}
		System.out.println("binary number is :: "+binary);
	}

}
