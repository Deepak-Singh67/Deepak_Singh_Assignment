package pattern;

import java.util.Scanner;

public class Number_Pattern_1_to_n_Sp_decre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		
		int a = 1;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}

	}

}
