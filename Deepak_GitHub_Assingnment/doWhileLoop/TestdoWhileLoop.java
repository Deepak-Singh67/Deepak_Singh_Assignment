package doWhileLoop;

import java.util.Scanner;

public class TestdoWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter a number ::");
		int a = sc.nextInt();
		
		int i = 1;
		
		do {
			System.out.print(i+" ");
			i++;
		}while(i <= a);
		
		System.out.println();
		
		System.out.println("end of the main");
		
	}//main

}//class
