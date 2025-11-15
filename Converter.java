import java.util.*;

public class Converter{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	double dollars;
	System.out.print("Enter the amount in dollars:$ ");
	dollars = sc.nextDouble();
	
	// 1dollar = 100 cents
	int cents;
	cents = (int)Math.round(dollars * 100);   
	int dollarPart;
	dollarPart = cents /100;
	int remainingCents = cents % 100;

	// 1quarter = 25 cents
	int quarters;
	quarters = remainingCents / 25;
	remainingCents = remainingCents % 25;

	// 1dime = 10 cent coin
	int dimes;
	dimes = remainingCents / 10;
	remainingCents = remainingCents % 25;
	 
	// 1nickel = 5 cent coin
	int nickel;
	nickel = remainingCents / 5;
	remainingCents = remainingCents % 5;

	// pennies = 1 cent coin
	int pennies;

	System.out.println("Dollars in cents: " + cents);
	System.out.println("No. of dollars:$ " + dollarPart);
	System.out.println("No. of quarters: " + quarters);
	System.out.println("No. of dimes: " + dimes);
	System.out.println("No. of nickels: " + nickel);
	System.out.println("Pennies: " + remainingCents);

	sc.close();
	}
}

	