import java.util.Scanner;
class IOScanner{

	public static void main(String ...deepak){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Value of x");
		int x = sc.nextInt();
		System.out.println("Value of x is :: "+x);
		
		System.out.print("Enter a boolean value : ");
		boolean a = sc.nextBoolean();
		System.out.println("boolean value is :: "+a);
		
		System.out.print("Enter a byte value : ");
		byte b = sc.nextByte();
		System.out.println("byte value is :: "+b);
		
		System.out.print("Enter a short value : ");
		short c = sc.nextShort();
		System.out.println("short value is :: "+c);
		
		
		System.out.print("Enter a int value : ");
		int d = sc.nextInt();
		System.out.println("int value is :: "+d);
		
		System.out.print("Enter a long value : ");
		long e = sc.nextLong();
		System.out.println("long value is :: "+e);
		
		System.out.print("Enter a float value : ");
		float f = sc.nextFloat();
		System.out.println("float value is :: "+f);
		
		System.out.print("Enter a double value : ");
		double g = sc.nextDouble();
		System.out.println("double value is :: "+g);
		
		System.out.print("Enter a character : ");
		char h = sc.next().charAt(0);
		System.out.println("character is :: "+h);
		
	}
}