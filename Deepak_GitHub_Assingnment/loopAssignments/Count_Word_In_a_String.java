package loopAssignments;

import java.util.Scanner;

public class Count_Word_In_a_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter any String :: ");
		String s = sc.nextLine();

		int count = 0;

		char ch[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {

			ch[i] = s.charAt(i);

	if ((i > 0) && (ch[i] != ' ') && (ch[i-1] == ' ') || (ch[0] == ' ') && (i == 0)) {
				count++;
			}
		}

			System.out.println("number of word in String is :: "+count);
	}//main

}//class
