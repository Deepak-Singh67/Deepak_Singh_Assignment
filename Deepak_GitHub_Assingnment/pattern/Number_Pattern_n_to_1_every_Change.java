package pattern;

import java.util.Scanner;

public class Number_Pattern_n_to_1_every_Change {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
