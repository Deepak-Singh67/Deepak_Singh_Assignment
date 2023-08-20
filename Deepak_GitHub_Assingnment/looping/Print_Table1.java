package com.deepak.looping;

import java.util.Scanner;

public class Print_Table1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number to print table :: ");
			int num = sc.nextInt();
			
			int i;//declaration
			
			i = 1;//initilization
			
			while (i <= 10) { //condition
				System.out.println(i+" * "+num+" = "+(i*num));	//Execution statement
				i++;//update value of i
			}
		
		

	}

}
