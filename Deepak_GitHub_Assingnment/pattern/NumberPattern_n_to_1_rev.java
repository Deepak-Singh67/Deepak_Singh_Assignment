package pattern;

import java.util.Scanner;

public class NumberPattern_n_to_1_rev {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
