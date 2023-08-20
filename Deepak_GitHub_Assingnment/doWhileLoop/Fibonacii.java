package doWhileLoop;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number for fibnocis :: ");
		int fab = sc.nextInt();
		
		int a = 0, b = 1, c;
		
		System.out.print(a+" "+b+" ");
		do {
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}while(c < fab);	
		
		System.out.println();
		System.out.println("end of main");
				

	}

}
