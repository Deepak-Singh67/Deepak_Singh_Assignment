package loopAssignments;

import java.util.Scanner;

public class Swap_first_and_last_Digit_In_a_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number :: ");

		int n = sc.nextInt();
		
		int first = 0, last = 0, temp = 0;
			last = n%10;
			
			first = n;
		
		while (first >= 10) {
			first = first/10;
		}
		
		System.out.println("before swaping");
		System.out.println(n+" the number of first digit is :: " + first);
		System.out.println(n+" the number of last digit is :: " + last);
		
		System.out.println("after swaping");
		
		temp = first;
		first = last;
		last = temp;
		
		System.out.println(n+" the number of first digit is :: " + first);
		System.out.println(n+" the number of last digit is :: " + last);

	}// main

}// class
