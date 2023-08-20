import java.util.Scanner;

class FahrenheitToC{
			
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Temperature in Fahrenheit : ");
		int f = sc.nextInt();
		
		
		int c = (f-32)*(5)/9;
		System.out.println("Temperature in Celsius "+c);	

		
	}
}