package pattern;

import java.util.Scanner;

public class Number_Pattern_n_to_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > n-i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
