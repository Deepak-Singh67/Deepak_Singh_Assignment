package loopAssignments;

import java.util.Scanner;

public class Fibonacci_n_term {

	static void fibonacci(int n) {
		int a = 0, b = 1, c = 0;
		if (n == 0) {
			System.out.println("invalid number...!");
		} else if (n == 1) {
			System.out.println(0 + " ");
		} else {
			System.out.print(0 + " " + 1 + " ");
			int i = 2;
			while (i < n) {
				c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;

				i++;
			}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :: ");
		int n = sc.nextInt();

		fibonacci(n);
	}

}
