package pattern;

import java.util.Scanner;

public class Star_Pattern_Opposit_Diamond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		int m = n;
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = m; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = m; j >= i+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		for (int i = 1; i <= m; i++) {
			
			for (int j = m; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}//main

}//class
