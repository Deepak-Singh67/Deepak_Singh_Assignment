package loopAssignments;

import java.util.Scanner;

public class Decimal_to_HexaDecimal {

	public static void main(String[] args) {
		
		System.out.println("Decimal to HexaDecimal Conversion :=>");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number :: ");
		int n = sc.nextInt();
		int temp = n;
		int rem = 0;
		String hex = "";
		
		while(temp > 0) {
			rem = temp%16;
			if(rem >= 10) {
				switch(rem) {
				case 10:
					
					hex = 'A'+hex;
					break;
				case 11:
					hex = 'B'+hex;
					break;
				case 12:
					hex = 'C'+hex;
					break;
				case 13:
					hex = 'D'+hex;
					break;
				case 14:
					hex = 'E'+hex;
					break;
				default:
					hex = 'F'+hex;
					break;
				}//switch
			}else {
				hex = rem+hex;
			}//else
			
			temp = temp/16;
		}//while
		System.out.println("HexaDecimal number is :: "+hex);		
	}//main

}//class
