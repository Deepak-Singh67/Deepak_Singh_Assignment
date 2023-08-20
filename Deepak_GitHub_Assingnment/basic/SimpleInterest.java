import java.util.Scanner;

class SimpleInterest{
	
	public static void main(String ...deepak){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principal amount :: ");
		int p = sc.nextInt();
		
		System.out.print("Enter Rate Of Interest :: ");
		int r = sc.nextInt();
		
		System.out.print("Enter Time in year :: ");
		int t = sc.nextInt();
		
		
		float simpleInterest = (float) (p*r*t)/100;
		
		System.out.println("SimpleInterest is :: "+simpleInterest);
	}
}