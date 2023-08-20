package loopAssignments;

import java.util.Scanner;

public class Power_Using_For_Loop {

	static int pow(int x, int y) {
		
		int pow1 = 1;
		
		
		for (int i = 1; i <= y; i++) {
			pow1 = pow1*x;
		}
		return pow1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value of Input base ::  ");
		int x = sc.nextInt();
		System.out.print("enter value of exponent ::  ");
		int y = sc.nextInt();
		
		int pow1 = pow(x, y);
		
		System.out.println(x+" ^ "+y+" = "+pow1);

	}//main

}//class
