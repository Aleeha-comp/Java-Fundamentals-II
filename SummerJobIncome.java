import java.util.*;

public class SummerJobIncome{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	double payPerHour;
	System.out.print("Enter the pay rate for an hour:$ ");
	payPerHour = input.nextDouble();

	double workingHours;
	System.out.print("Number of hours worked each week: ");
	workingHours = input.nextDouble();
	
	double grossIncome;
	grossIncome = payPerHour * workingHours * 5;
	System.out.println("Income before taxes from your summer job:$ " + grossIncome);

	double taxAmount = grossIncome * 0.14;
	double income = grossIncome -taxAmount;
	System.out.println("Income after taxes from your summer job:$ " + income);

	double spend1 = income * 0.10;
	System.out.print("Money spend on clothes and other accessories:$ ");
	System.out.printf("%.4f\n", spend1);

	income = income - spend1;
	double spend2 = income * 0.01;
	System.out.print("Money spend on school supplies:$ ");
	System.out.printf("%.4f\n", spend2);

	income = income -spend2;
	double spend3 = income * 0.25;
	System.out.print("Money spend to buy saving bonds:$ ");
	System.out.printf("%.4f\n", spend3);
	
	double additionalSpend;
	additionalSpend = spend3 * 0.50;
	System.out.print("Money spend by parents to buy additional savings bond:$ ");
	System.out.printf("%.4f\n", additionalSpend);
	input.close();
	}
}
	
	
	