package pattern;

import java.util.Scanner;

public class CharacterPattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int a = sc.nextInt();
		
		char ch = (char)65;
		for (int i = 1; i <= a; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(ch+" ");
				
			}
			ch++;
			System.out.println();
		}

	}

}
