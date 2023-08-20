package loopAssignments;

import java.util.Scanner;

public class Prime_Factors {

	static void primeFactor(int n) {

		int j = 1;

		while (j <= n) {
			if (n % j == 0) {

				int flag = 0;

				int i = 2;
				
				while (i <= j / 2) {
					if (j % i == 0) {
						flag = 1;
						break;
					} // if
					i++;
				} //Inner loop

				if (j == 0 || j == 1) {
					
				} else if (flag >= 1) {
			
				} else {
					System.out.print(j + " ");
				}
				
			}//outer loop
			j++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number to find Prime factors ::  ");
		int n = sc.nextInt();

		primeFactor(n);

	}// main

}// class
