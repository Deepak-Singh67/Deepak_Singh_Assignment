package pattern;

import java.util.Scanner;

public class StarPatternRev {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			
			for (int j = i; j <= a; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
