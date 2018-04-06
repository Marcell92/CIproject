import java.util.Scanner;

public class ciMain {

	public static void main(String[] args) {
		
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Two Numbers of your choice : ");
	       int num1 = scan.nextInt();
	       int num2 = scan.nextInt();
	       
	       System.out.println("Addition = " + (addition(num1, num2)));
	       System.out.println("Subtraction = " + (subtraction(num1, num2)));
	       System.out.println("Multiplication = " + (multiplication(num1, num2)));
	       System.out.println("Division = " + (division(num1, num2)));
	       
	}
	
	
	public static int addition (int num1, int num2) {
		
		int result = num1 + num2;
		return result;
	}
	public static int subtraction (int num1, int num2) {
		
		int result = num1 - num2;
		return result;
	}
	
	public static int multiplication (int num1, int num2) {
		
		int result = num1 * num2;
		return result;
	}
	
	public static int division (int num1, int num2) {
		
		int result = num1 / num2;
		return result;
	}
	

}
