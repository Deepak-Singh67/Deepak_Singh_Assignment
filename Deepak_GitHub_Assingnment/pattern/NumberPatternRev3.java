package pattern;

import java.util.Scanner;

public class NumberPatternRev3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int a = sc.nextInt();
		
		for (int i = a; i >= 1; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
