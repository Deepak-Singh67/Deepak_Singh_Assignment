package loopAssignments;

import java.util.Scanner;

public class Natural_No__Reverse_n_to_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter a number to print n to 1 :: ");
		int n = sc.nextInt();

		int i = n;

		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}

	}//main

}//class
