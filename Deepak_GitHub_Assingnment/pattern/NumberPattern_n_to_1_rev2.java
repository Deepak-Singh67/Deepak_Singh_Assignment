package pattern;

import java.util.Scanner;

public class NumberPattern_n_to_1_rev2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n-1; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
