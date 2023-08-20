package loopAssignments;

import java.util.Scanner;

public class Check_Palindrome_or_not {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number :: ");

		int n = sc.nextInt();

		int temp = n, rem = 0, rev = 0;

		while (temp != 0) {
			rem = temp % 10;
			rev = rem+(rev*10);
			temp = temp / 10;
		}

		if(n == rev) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}
			
		

	}// main

}// class
