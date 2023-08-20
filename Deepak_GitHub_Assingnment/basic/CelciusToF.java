import java.util.Scanner;

class CelciusToF{
			
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Temperature in Celsius : ");
		int c = sc.nextInt();
		
		
		int f = (c*9)/5+32;
		System.out.println("Temperature in Fahrenheit "+f);	

		
	}
}