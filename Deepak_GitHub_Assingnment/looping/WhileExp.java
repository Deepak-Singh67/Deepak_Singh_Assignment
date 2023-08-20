package com.deepak.looping;

import java.util.Scanner;

public class WhileExp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("eneter a number :: ");
		int x = sc.nextInt();
		
			int i,j,k;
			i = 1;
		
		while(i<= x) {
			System.out.println("i = "+i);
			System.out.println("statement-1");
			i++;
		}
		j = 1;
		while(j<=x) {
			System.out.println("j = "+j++);
			System.out.println("statement-2");
			
		}
		
		j = i;
		while(j >= x) {
			System.out.println("j = "+j--);
			System.out.println("statement-3");
			
		}
		
		k = i;
		while(k >= x) {
			System.out.println("k = "+k--);
			System.out.println("statement-4");
			
		}
		
		

	}

}
