package pattern;

import java.util.Scanner;

public class NumberPattern_1_to_n_rev2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
