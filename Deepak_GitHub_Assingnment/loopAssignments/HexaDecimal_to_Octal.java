package loopAssignments;

import java.util.Scanner;

public class HexaDecimal_to_Octal {

	public static void main(String[] args) {
		System.out.println("HexaDecimal to Decimal Conversion :=>");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter HexaDecimal number :: ");
		String s = sc.nextLine();
		int length = s.length();
		int decimal = 0;
		int digit = 0;

		for (int i = 0; i < length; i++) {

			char ch = s.charAt(length - i - 1);

		//	System.out.println(ch);

			if (ch >= 'A' && ch <= 'F') {
				switch (ch) {
				case 'A':
					digit = 10;
					break;
				case 'B':
					digit = 11;
					break;
				case 'C':
					digit = 12;
					break;
				case 'D':
					digit = 13;
					break;
				case 'E':
					digit = 14;
					break;
				default:
					digit = 15;
					break;
				}// switch
			}else if(ch >= '0' && ch <= '9') {
				digit = s.charAt(length - i - 1) - '0';
			}else {
				System.out.println("invalid character in hexadecimal...!");
				break;
			} // else

			int p = (int) (digit * (Math.pow(16, i)));

			decimal += p;

		}

		int temp = decimal;
		int rem = 0;
		String octal = "";
		
		while(temp > 0) {
			rem = temp%8;
			octal = rem+octal;
			temp = temp/8;
		}
		System.out.println("Octal Number is :: "+octal);
	}

}
