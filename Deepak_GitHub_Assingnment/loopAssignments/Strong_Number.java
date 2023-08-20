package loopAssignments;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :: ");
		int n = sc.nextInt();
		
		int temp = n, sum = 0;//145
		
		while(temp > 0) {
			int rem = temp%10;
			
			int i = 1, fact = 1;
			while (i <= rem) {
				fact = fact*i;
				i++;
			}//inner loop
			
			temp = temp/10;
			
			sum = sum+fact;
			
		}//outer loop
		
		if(n == sum) {
			System.out.println(n+" is Strong Number ");
		}else {
			System.out.println(n+" is not Strong Number ");
		}
		
	}// main

}// class
