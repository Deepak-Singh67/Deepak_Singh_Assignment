package loopAssignments;

import java.util.Scanner;

public class Find_Frequency_of_each_digit_in_a_given_interger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number :: ");

		long n = sc.nextLong();

		long temp = n, rem = 0;
		long n0 = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0;

		while (temp != 0) {
			rem = temp % 10;
			temp = temp / 10;
			if (rem == 0) {
				n0++;
			} else if (rem == 1) {
				n1++;
			} else if (rem == 2) {
				n2++;
			} else if (rem == 3) {
				n3++;
			} else if (rem == 4) {
				n4++;
			} else if (rem == 5) {
				n5++;
			} else if (rem == 6) {
				n6++;
			} else if (rem == 7) {
				n7++;
			} else if (rem == 8) {
				n8++;
			} else{
				n9++;
			}

		}//while
		System.out.println("Frequency of 0 = "+n0);
		System.out.println("Frequency of 1 = "+n1);
		System.out.println("Frequency of 2 = "+n2);
		System.out.println("Frequency of 3 = "+n3);
		System.out.println("Frequency of 4 = "+n4);
		System.out.println("Frequency of 5 = "+n5);
		System.out.println("Frequency of 6 = "+n6);
		System.out.println("Frequency of 7 = "+n7);
		System.out.println("Frequency of 8 = "+n8);
		System.out.println("Frequency of 9 = "+n9);
		
	}// main

}// class
