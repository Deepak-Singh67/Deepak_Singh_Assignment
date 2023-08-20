package loopAssignments;

import java.util.Scanner;

public class ArmStrong_1_to_n {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :: ");
		int n = sc.nextInt();
		
		 for (int i = 1; i <= n; i++) {
			 
			 int temp = 0, totalDigit = 0, lastDigit1 = 0;
				int originalNum = 0, lastDigit2 = 0, sum = 0;
				
			//Armstrong logic here	 
			 int j = i;
			 
			 originalNum = j;
			 temp = j;
			 
			 while(temp != 0) {
				 lastDigit1 = temp%10;
				 temp = temp/10;
				 totalDigit++;
			 }	 
			 
			 while(originalNum != 0) {
				 lastDigit2 = originalNum%10;
				 sum = (int) (sum + Math.pow(lastDigit2,totalDigit));
				 originalNum = originalNum/10;
			 }
			
			if(i == sum) {
				System.out.print(i+" ");
			}
			
		}//outer loop
		
	}//main

}//class
