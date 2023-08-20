package loopAssignments;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		
		int temp = 0, n = 0, totalDigit = 0, lastDigit1 = 0;
		int originalNum = 0, lastDigit2 = 0, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :: ");
		 n = sc.nextInt();
		 originalNum = n;
		 temp = n;
		 
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
		
		if(n == sum) {
			System.out.println("is Armstrong Number "+n);
		}else {
			System.out.println("is noy Armstrong Number "+n);
		}
		
	}

}
