import java.util.*;

public class Lab3Task5{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	final double MILK_IN_A_CARTON = 3.78;
	final double COST_PER_LITER = 0.38;
	final double PROFIT_PER_CARTON = 0.27;
	
	double milkProduced;
	System.out.print("Total amount of milk produced in the morning: ");
	milkProduced = input.nextDouble();
	
	double cartons;
	cartons = milkProduced / MILK_IN_A_CARTON;
	long num = Math.round(cartons);
	System.out.println("Number of cartons needed to hold milk: " + num);
	
	double cost = milkProduced * COST_PER_LITER;
	System.out.println("The cost of producing milk:$" + cost);

	double profit = num * PROFIT_PER_CARTON;
	System.out.println("The profit for producing milk:$" + profit);
	
	input.close();
	
	}
}