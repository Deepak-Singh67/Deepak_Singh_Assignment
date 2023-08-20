package loopAssignments;

import java.util.Scanner;

public class Perfect_1_to_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :: ");
		int n = sc.nextInt();

		System.out.print("all perfect under " + n+" ::=> ");

		int j = 1;
		while (j <= n) {

			int i = 1;
			int sum = 0;
			while (i <= j / 2) {
				if (j % i == 0) {
					sum = sum + i;
				} // if
				i++;
			} // inner loop

			if (j == sum) {
				System.out.print(j + " ");
			} // if

			j++;
		} // outer loop
	}// main

}// class
