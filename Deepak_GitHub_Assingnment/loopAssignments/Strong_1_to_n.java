package loopAssignments;

import java.util.Scanner;

public class Strong_1_to_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :: ");
		int n = sc.nextInt();

		int j = 1;
		while (j <= n) {

			int temp = j, sum = 0;// 1, 145, 40585

			while (temp > 0) {
				int rem = temp % 10;

				int i = 1, fact = 1;
				while (i <= rem) {
					fact = fact * i;
					i++;
				}
				temp = temp / 10;
				sum = sum + fact;
			}

			if (j == sum) {
				System.out.print(j+" ");
			}

			j++;
		}

	}// main

}// class
