package loopAssignments;

import java.util.Scanner;

public class Natural_No_1_to_n {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a n number :: ");
		int n = sc.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			System.out.print(i+" ");
			i++;
		}
		

	}

}
