import java.util.Scanner;

public class Lab3Task3{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int a,b,c;
	int minDesks;

	System.out.print("The number of students in class a: ");
	a = input.nextInt();
	
	System.out.print("The number of students in class b: ");
	b = input.nextInt();

	System.out.print("The number of students in class c: ");
	c = input.nextInt();

	a = (a + 1) / 2;
	b = (b + 1) / 2;
	c = c / 2;

	minDesks = a + b + c;
	System.out.println("The smallest possible number of desks that can be purchased: " + minDesks);

	input.close();
	}
}
	