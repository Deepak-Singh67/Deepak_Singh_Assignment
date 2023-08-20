import java.util.Scanner;

class RediusOfCircle{
			
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Redius of a circle  : ");
		float r = sc.nextFloat();
		
		
		double diameter = (double) 2*r;
		System.out.println("the diameterif a circle :: "+diameter);	

		double circumference = (double) 2*(3.14*r);
		System.out.println("the circumference a circle :: "+circumference);

		double area = (double) 3.14*(r*r);
		System.out.println("the area a circle :: "+area);
		
		
	}
}