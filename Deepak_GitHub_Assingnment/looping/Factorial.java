package com.deepak.looping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number to find factorial :: ");
			int num = sc.nextInt();
			
			int i= num, fact = 1;//declaration
			
			
			while (i >= 1) { //condition
				fact = fact*i;
				i--;
			}
			System.out.println(num+" factorial is :: "+fact);
		
		

	}

}
