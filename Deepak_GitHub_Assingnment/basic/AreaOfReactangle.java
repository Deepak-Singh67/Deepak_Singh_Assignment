import java.util.Scanner;
class AreaOfReactangle{
			
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of  rectangle  : ");
		int a = sc.nextInt();
		
		System.out.println("Enter breadth  of  rectangle  : ");
		int b = sc.nextInt();
		
		int rect = a*b;
		
		System.out.println("the area of rectangle is :: "+rect);		
		
	}
}