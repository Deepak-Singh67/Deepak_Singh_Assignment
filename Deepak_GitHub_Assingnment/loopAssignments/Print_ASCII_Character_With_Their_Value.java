package loopAssignments;

public class Print_ASCII_Character_With_Their_Value {

	public static void main(String[] args) {

		System.out.println("ASCII character with their values :: ");

		int i = 1;

		while (i <= 255) {
			System.out.println("ASCII value of character "+(char)i+" = "+i);
			i++;
		}
		

	}

}
