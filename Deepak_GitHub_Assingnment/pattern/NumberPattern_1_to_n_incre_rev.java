package pattern;

public class NumberPattern_1_to_n_incre_rev {

	public static void main(String[] args) {
		
		
		int a = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}

	}

}
