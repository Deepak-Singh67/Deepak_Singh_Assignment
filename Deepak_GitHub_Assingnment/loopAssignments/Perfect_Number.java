package loopAssignments;

import java.util.Scanner;

public class Perfect_Number {

	static int perfectNum(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :: ");
		int n = sc.nextInt();

		int sum = perfectNum(n);
		
//		System.out.println(sum);
		
		if(n == sum) {
			System.out.println(n+" is Perfect Number ");
		}else {
			System.out.println(n+" is not Perfect Number ");
		}
	}// main

}// class
