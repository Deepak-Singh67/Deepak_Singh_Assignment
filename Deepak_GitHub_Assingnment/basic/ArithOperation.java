import java.util.Scanner;
class ArithOperation{
	
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x : ");
		int x = sc.nextInt();
		
		System.out.println("Enter value of x : ");
		int y = sc.nextInt();
		
		int result;
		
			result = x+y;
			System.out.println("sum is : "+result);
			
			result = x-y;
			System.out.println("sub is : "+result);
			
			result = x*y;
			System.out.println("Mul is : "+result);
			
			float rs = (float)x/y;
			System.out.println("Div is : "+rs);
			
			result = x%y;
			System.out.println("Reminder is : "+result);
			
			
			
			
			
	}
}