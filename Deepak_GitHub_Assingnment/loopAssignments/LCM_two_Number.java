package loopAssignments;

import java.util.Scanner;

public class LCM_two_Number {

	static int lcm(int x, int y) {

		int i = 1, lcm = 1, max = 0;

		max = (x > y) ? x : y;
		
		i = max;
		
		while (true) {
			if (i % x == 0 && i % y == 0) {
				lcm = i;
				break;
			}
			i = i+max;
		}
		return lcm;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number :: ");
		int x = sc.nextInt();

		System.out.print("enter second number :: ");
		int y = sc.nextInt();

		long hcf = lcm(x, y);

		System.out.println(x + " and " + y + " HCF is :: " + hcf);
	}// main

}// class
