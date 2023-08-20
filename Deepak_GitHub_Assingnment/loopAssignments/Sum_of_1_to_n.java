package loopAssignments;

import java.util.Scanner;

public class Sum_of_1_to_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter n number to find sum of 1 to n :: ");
		int n = sc.nextInt();

		int i = 1, sum = 0;

		while (i <= n) {
			sum = sum + i;
			i++;
		}

		System.out.println("the sum of 1 to n is :: " + sum);

	}// main

}// class
