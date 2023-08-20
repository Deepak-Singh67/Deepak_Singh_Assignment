package loopAssignments;

import java.util.Scanner;

public class Sum_of_first_and_last_Digit_in_a_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number :: ");

		int n = sc.nextInt();

		int first = 0, last = 0, sum = 0;
		last = n % 10;

		first = n;

		while (first >= 10) {
			first = first / 10;
		}

		sum = first + last;
		System.out.println(n + " the sum of first and last digit is :: " + sum);

	}// main

}// class
