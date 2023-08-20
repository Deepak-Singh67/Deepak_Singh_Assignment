package loopAssignments;

import java.util.Scanner;

public class Product_of_digit_a_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number :: ");

		int n = sc.nextInt();

		int temp = n, rem = 0, product = 1;

		while (temp != 0) {
			rem = temp % 10;
			product = product * rem;
			temp = temp / 10;
		}
		
		System.out.println(n+" Product is :: "+product);

	}// main

}// class
