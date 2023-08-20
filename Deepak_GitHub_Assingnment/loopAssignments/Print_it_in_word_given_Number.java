package loopAssignments;

import java.util.Scanner;

public class Print_it_in_word_given_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter a number :: ");
		int n = sc.nextInt();

		System.out.println(n);
		
		int rem = 0, rev = 0;


		while (n != 0) {
			
			rem = n % 10;
			rev = rem+(rev*10);
			n = n / 10;
		}
		
		int temp = rev;
		
		while (temp != 0) {
			switch (temp % 10) {
			case 0:
				System.out.print("zero ");
				break;
			case 1:
				System.out.print("one ");
				break;
			case 2:
				System.out.print("two ");
				break;
			case 3:
				System.out.print("three ");
				break;
			case 4:
				System.out.print("four ");
				break;
			case 5:
				System.out.print("five ");
				break;
			case 6:
				System.out.print("six ");
				break;
			case 7:
				System.out.print("seven ");
				break;
			case 8:
				System.out.print("eight ");
				break;
			default:
				System.out.print("nine ");
				break;
			}// switch
			
			temp = temp/10;

		} // while

	}// main

}// class
