package pattern;

import java.util.Scanner;

public class StarPattern_O {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {

			for (int j = a; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = a; j >= i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}//upper part end
		
		for (int i = 1; i <= a; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = a-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = a-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}//main

}//class
