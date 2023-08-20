package loopAssignments;

import java.util.Scanner;

public class Print_Reverse_a_number {

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

		System.out.println("reverse :: " + rev);

	}// main

}// class
