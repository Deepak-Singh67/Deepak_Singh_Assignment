package com.deepak.looping;

import java.util.Scanner;

public class Table_1_to_N {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter range of factorial :: ");
			int num = sc.nextInt();
			
			System.out.println("the range is :: "+num);
			
			int i = 1, fact = 1, j = 1;
			
			while(i <= num) {
				fact = 1;
				j = i;
				
				while (j != 0) {
					fact = fact*j;
					j--;
				}
				System.out.print("factorial if "+i+" is = "+fact);
				System.out.println();
				i++;
			}
			

	}//main

}//class
