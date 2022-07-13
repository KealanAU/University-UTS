import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value for b: ");
		int b = sc.nextInt();
		
		//Add your code starting here.
		int addition = a + b;
		int subtraction = a - b;
		int multiplication = a * b;
		int division = a / b;
		int modulo = a % b;


		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(division);
		System.out.println(modulo);
	}
	
}