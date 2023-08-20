package loopAssignments;

import java.util.Scanner;

public class Find_Factorial_of_a_number {

	static long factorial(int x) {

		int i = 1, fact = 1;

		while (i <= x) {
			fact = fact*i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number to find factorial :: ");
		int x = sc.nextInt();

		long fact = factorial(x);
		
		System.out.println(x+" factorial is :: "+fact);	}// main

}// class
