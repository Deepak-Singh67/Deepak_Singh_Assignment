import java.util.Scanner;

class AreaOfTriangle{
	
	public static void main(String ...deepak){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base :: ");
		int base = sc.nextInt();
		
		System.out.print("Enter height :: ");
		int height = sc.nextInt();
		
		float area = (float) 1*(base*height)/2;
		
		System.out.println("Area Of  Triangle is :: "+area);
	}
}