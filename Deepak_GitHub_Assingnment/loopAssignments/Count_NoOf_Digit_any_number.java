package loopAssignments;

import java.util.Scanner;

public class Count_NoOf_Digit_any_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter any number to count digit :: ");
		int n = sc.nextInt();

		int i = 0;
		int temp = n;
		while (temp != 0) {
			temp = temp/10;
			i++;
		}

		System.out.println("the number of digit is :: " + i);

	}// main

}// class
