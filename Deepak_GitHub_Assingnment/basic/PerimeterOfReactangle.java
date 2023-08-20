import java.util.Scanner;
class PerimeterOfReactangle{
	
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of  rectangle  : ");
		int a = sc.nextInt();
		
		System.out.println("Enter breadth  of  rectangle  : ");
		int b = sc.nextInt();
		
		int rect = 2*(a+b);
		
		System.out.println("the perimeter of rectangle is :: "+rect);		
		
	}
}