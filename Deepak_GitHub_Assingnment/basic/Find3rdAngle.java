import java.util.Scanner;

class Find3rdAngle{
	
	public static void main(String ...deepak){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value angle one :: ");
		int a1 = sc.nextInt();
		
		System.out.print("Enter value angle two :: ");
		int a2 = sc.nextInt();
		
		int thirdAngle = 180-(a1+a2);
		
		System.out.print("third angle is :: "+thirdAngle);
	}
}