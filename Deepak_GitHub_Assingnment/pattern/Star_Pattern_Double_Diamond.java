package pattern;

import java.util.Scanner;

public class Star_Pattern_Double_Diamond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		int m = n;

		for (int i = 1; i <= m; i++) {
			
			for (int j = m-1; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= i-1; j++) {
				System.out.print("*");
			}
			//1st end
			
			
			for (int j = m-1; j >= i; j--) {
				System.out.print(" ");
			}for (int j = m-1; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= i-1; j++) {
				System.out.print("*");
			}
			//2nd end
			System.out.println();
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = m-1; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = m-2; j >= i; j--) {
				System.out.print("*");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			
			for (int j = m-1; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = m-2; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}//main

}//class
