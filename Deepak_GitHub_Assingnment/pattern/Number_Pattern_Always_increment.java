package pattern;

import java.util.Scanner;

public class Number_Pattern_Always_increment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}

	}

}
