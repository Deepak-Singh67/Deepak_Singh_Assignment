package pattern;

import java.util.Scanner;

public class CharacterPatternRev {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			char ch = (char)65;
			for (int j = 1; j <= a+1-i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
