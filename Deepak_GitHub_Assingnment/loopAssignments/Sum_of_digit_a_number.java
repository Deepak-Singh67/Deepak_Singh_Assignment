package loopAssignments;

import java.util.Scanner;

public class Sum_of_digit_a_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number :: ");

		int n = sc.nextInt();

		int temp = n, rem = 0, sum = 0;

		while (temp != 0) {
			rem = temp % 10;
			sum = sum + rem;
			temp = temp / 10;
		}
		
		System.out.println(n+" sum of :: "+sum);

	}// main

}// class
