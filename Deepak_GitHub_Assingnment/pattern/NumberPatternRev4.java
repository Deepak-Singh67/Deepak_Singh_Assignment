package pattern;

import java.util.Scanner;

public class NumberPatternRev4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			
			for (int j = 1; j <= a+1-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
