package loopAssignments;

import java.util.Scanner;

public class Multiplication_Table_of_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter n number to print multiplecation :: ");
		int n = sc.nextInt();

		int i = 1;

		while (i <= 10) {
			System.out.println(n+"*"+i+" = "+(n*i));
			i++;
		}

	}// main

}// class
