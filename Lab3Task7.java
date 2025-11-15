import java.util.Scanner;

public class Lab3Task7{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	final int CLASS_A_SEATS_COST = 20;
	final int CLASS_B_SEATS_COST = 15;
	final int CLASS_C_SEATS_COST = 10;
	final int CLASS_D_SEATS_COST = 5;
	int a,b,c,d;
	int totalIncome;

	System.out.print("The number of sold tickets of class A: ");
	a = input.nextInt();

	System.out.print("The number of sold tickets of class B: ");
	b = input.nextInt();

	System.out.print("The number of sold tickets of class C: ");
	c = input.nextInt();

	System.out.print("The number of sold tickets of class D: ");
	d = input.nextInt();

	totalIncome = (a * CLASS_A_SEATS_COST) + (b *CLASS_B_SEATS_COST) + (c * CLASS_C_SEATS_COST) + (d * CLASS_D_SEATS_COST);
	System.out.print("The total income generated:$ " + totalIncome);
	
	input.close();
	}
}