package pattern;

import java.util.Scanner;

public class NumberPattern_1_to_n_rev {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= a-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
