package loopAssignments;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a n number to check prime or not :: ");
		int n = sc.nextInt();
		int flag = 0;
		
			int i = 2;
			while(i <= n/2) {
				if(n%i == 0) {
					flag = 1;
					break;
				}//if
				i++;
			}//while
			
		if(n == 0 || n == 1) {
				System.out.println("is not prime");
			}
		else if(flag >= 1) {
			System.out.println("is not prime ");
		}else {
			System.out.println("is prime ");
		}

	}//main

}//class
