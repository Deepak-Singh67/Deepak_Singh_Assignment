package loopAssignments;

import java.util.Scanner;

public class Sum_Of_Odd_1_to_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter n number to find sum of odd 1 to n :: ");
		int n = sc.nextInt();

		int i = 1, sum = 0;

		while (i <= n) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		}

		System.out.println("the sum of 1 to n is :: " + sum);

	}// main

}// class
