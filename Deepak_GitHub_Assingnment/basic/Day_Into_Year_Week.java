import java.util.Scanner;

class Day_Into_Year_Week{
			
	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Days : ");
		int day = sc.nextInt();
		
		
		float year = (float) day/365;
		System.out.println("year "+year);

		float week = (float) day/7;
		System.out.println("week "+week);

		
	}
}