package com.deepak.looping;

import java.util.Scanner;

public class Factorial_1_to_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the number to print table ");
		int num = sc.nextInt();

		System.out.println("the number is :: " + num);

		int i = 2, j = 1;

		while (i <= num) {

			j = 1;

			while (j <= 10) {
				System.out.print(j * i + " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}// main

}// class
