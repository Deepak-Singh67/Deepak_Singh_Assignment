package pattern;

import java.util.Scanner;

public class Number_Pattern_n_to_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
