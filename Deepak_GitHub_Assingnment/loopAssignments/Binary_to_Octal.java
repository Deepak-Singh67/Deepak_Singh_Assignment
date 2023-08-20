package loopAssignments;

import java.util.Scanner;

public class Binary_to_Octal {

	public static void main(String[] args) {
		System.out.println("Binary to Octal Conversion :=>");
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
		//decimal to octal
		int temp = decimal;
		int rem = 0;
		String rev = "";
		
		while(temp > 0) {
			rem = temp%8;
			rev = rem+rev;
			temp = temp/8;
		}
		System.out.println("Octal is :: "+rev);
	}

}
