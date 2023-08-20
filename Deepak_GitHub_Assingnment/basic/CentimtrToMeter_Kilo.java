import java.util.Scanner;

class CentimtrToMeter_Kilo{
			
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter centimeter : ");
		long c = sc.nextLong();
		
		
		double m = (double) c/100;
		System.out.println("meter :: "+m);	

		double km = (double) m/1000;
		System.out.println("kilometer :: "+km);

		
	}
}