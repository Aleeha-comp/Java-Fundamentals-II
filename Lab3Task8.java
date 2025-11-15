import java.util.Scanner;

public class Lab3Task8{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int a;
	System.out.print("Enter an integer between 0 and 1000:");
	a = sc.nextInt();

	int digit1 = a /100;
	int digit2 = (a / 10) % 10;
	int digit3 = a % 10;
	int sum = digit1 + digit2 + digit3;

	System .out.println("The sum of the digits is: " + sum);
	}
}

	
	
	