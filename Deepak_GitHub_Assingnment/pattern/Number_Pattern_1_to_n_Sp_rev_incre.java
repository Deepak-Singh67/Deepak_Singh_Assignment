package pattern;

import java.util.Scanner;

public class Number_Pattern_1_to_n_Sp_rev_incre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = n+1-i; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
