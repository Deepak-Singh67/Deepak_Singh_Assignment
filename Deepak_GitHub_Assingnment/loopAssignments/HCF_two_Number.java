package loopAssignments;

import java.util.Scanner;

public class HCF_two_Number {

	static long hcf(int x, int y) {

		int hcf = 0, min = 0;
		// find max

		min = (x < y) ? x : y;
		
		int i = 1;
		while (i <= min) {
			if (x % i == 0 && y % i == 0) {
				hcf = i;
			}
			i++;
		}
		return hcf;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number :: ");
		int x = sc.nextInt();

		System.out.print("enter second number :: ");
		int y = sc.nextInt();

		long hcf = hcf(x, y);

		System.out.println(x + " and " + y +" HCF is :: " + hcf);
	}// main

}// class
