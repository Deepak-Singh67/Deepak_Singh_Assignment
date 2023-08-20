import java.util.Scanner;

class Power{
	
/*	static int power(int x, int y){
		
		int pow = 1;
		for(int i = 0; i < y; i++){
			pow = pow*x;
		}
		return pow;
	}
	
*/
			
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of x :: ");
		int x = sc.nextInt();
		
		System.out.print("Enter value of y :: ");
		int y = sc.nextInt();
		
	/*	int pow = power(x,y);
		
		System.out.print("Power of x^y is :: "+pow);
		
	*/
		
		System.out.print("Power of x^y is :: "+Math.pow(x,y));
		
		
		
	}
}