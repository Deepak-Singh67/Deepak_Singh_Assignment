package pattern;

import java.util.Scanner;

public class CharacterPatternsp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int a = sc.nextInt();
		
		
		for (int i = 1; i <= a; i++) {
			char ch = (char)65;
			for (int j = a; j >= i+1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			
			System.out.println();
		}

	}

}
