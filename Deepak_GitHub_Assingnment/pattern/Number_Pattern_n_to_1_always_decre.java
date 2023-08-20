package pattern;

import java.util.Scanner;

public class Number_Pattern_n_to_1_always_decre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		
		int b = 15;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(b+" ");
				b--;
			}
			System.out.println();
		}

	}

}
