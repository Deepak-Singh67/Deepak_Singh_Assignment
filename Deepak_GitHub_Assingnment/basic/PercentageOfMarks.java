import java.util.Scanner;

class PercentageOfMarks{
	
	public static void main(String ...deepak){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter mark of hindi :: ");
		int h = sc.nextInt();
		
		System.out.print("Enter mark of english :: ");
		int eng = sc.nextInt();
		
		System.out.print("Enter mark of Physics:: ");
		int phy = sc.nextInt();
		
		System.out.print("Enter mark of chemistry :: ");
		int chemist = sc.nextInt();
		
		System.out.print("Enter mark of math :: ");
		int math = sc.nextInt();
		
		int totalMarks = h + eng + phy + chemist + math;
		
		float per = (float) totalMarks/5;
		
		System.out.println("Percentage is :: "+per);
	}
}