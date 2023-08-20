package com.deepak.looping;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter any Digits Number :: ");
			int num = sc.nextInt();
			
			System.out.println("Before Reverse :: "+num);
			
			int rem = 0, rev = 0, sum = 0, temp = 0;
			
			temp = num;
			
			while (num != 0) { //condition
				rem = num%10;
				sum = sum+rem;
				rev = (rev*10)+rem;
				num = num/10;
			}	
		
			System.out.println("Reverse is :: "+rev);
			System.out.println("Sum is :: "+sum);
			
			if(rev == temp) {
				System.out.println("is palindrome");
			}else {
				System.out.println("is not palindrome");
			}
		
			System.out.println("end of main");
	}//main

}//class
