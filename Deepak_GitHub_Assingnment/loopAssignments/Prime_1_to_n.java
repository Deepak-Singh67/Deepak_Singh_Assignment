package loopAssignments;

import java.util.Scanner;

public class Prime_1_to_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter n number to find all prime :: ");
		int n = sc.nextInt();

		int j = 1;
		while (j <= n) {

			int flag = 0;

			int i = 2;
			while (i <= j / 2) {
				if (j % i == 0) {
					flag = 1;
					break;
				} // if
				i++;
			} // while

			if (j == 0 || j == 1) {
				
			} else if (flag >= 1) {
		
			} else {
				System.out.print(j + " ");
			}

			j++;
		}

	}// main

}// class
