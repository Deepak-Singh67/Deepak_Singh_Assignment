package pattern;

import java.util.Scanner;

public class Number_Pattern_1_to_n_repeatouter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
