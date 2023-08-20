package loopAssignments;

import java.util.Scanner;

public class Check_Prime {

	static void prime(int x) {
		int mid = x / 2, flag = 0;
		if (x == 0 || x == 1) {
			System.out.println(x + " is not prime number");
		} else {

			int i = 2;
			while (i <= mid) {
				if (x % i == 0) {
					System.out.println(x + " is not prime number");
					flag = 1;
					return;
				}

			}
			if (flag == 0) {
				System.out.println(x + " is prime number");
			}
			i++;
		} // while

	}// method

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number to check prime :: ");
		int x = sc.nextInt();

		prime(x);

	}// main

}// class
