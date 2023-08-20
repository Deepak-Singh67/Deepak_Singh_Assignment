import java.util.Scanner;
class Area_Of_Equilateral_Triangle{
			
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of  rectangle  : ");
		int side = sc.nextInt();
		
		
		double area = ( 1.73 * side*side) / 4;
		
		System.out.println(" Area of Equilateral Triangle is :: "+area);		
		
	}
}