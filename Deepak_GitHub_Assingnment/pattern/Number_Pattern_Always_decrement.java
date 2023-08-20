package pattern;

public class Number_Pattern_Always_decrement {

	public static void main(String[] args) {

		int n = 15;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (n >= 1) {
					System.out.print(n + " ");
					n--;
				}
			}
			System.out.println();
		}

	}

}
