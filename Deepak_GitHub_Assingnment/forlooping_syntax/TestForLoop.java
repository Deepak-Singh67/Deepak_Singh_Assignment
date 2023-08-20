package forlooping;

import java.util.Scanner;

public class TestForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to test for loop ");
		
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for (int i = a; i >= 1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int i = 1;
		for (; i <= a; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int j = a;
		for (; j >= 1;) {
			System.out.print(j+" ");
			 j--;
		}
		
		System.out.println();
		
		int j1 = a;
		for (; ;) {
			if(j1 == 0) {
				break;
			}
			System.out.print(j1+" ");
			 j1--;
		}
		
	}

}
