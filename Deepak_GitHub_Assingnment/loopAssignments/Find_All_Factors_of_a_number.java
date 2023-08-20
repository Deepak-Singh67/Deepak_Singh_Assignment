package loopAssignments;

import java.util.Scanner;

public class Find_All_Factors_of_a_number {

	static void factor(int x) {

		int i = 1;

		while (i <= x) {
			if (x % i == 0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number to find factors ::  ");
		int x = sc.nextInt();

		factor(x);

	}// main

}// class
