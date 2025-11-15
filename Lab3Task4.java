import java.util.Scanner;

public class Lab3Task4{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N;
	int hours;
	int mins;
	System.out.print("The number of minutes that is passed midnight: ");
	N = sc.nextInt();
	
	hours = N/60;
	System.out.println("The number of hours (between 0 and 23): " + hours);
	
	mins = N%60;
	System.out.println("The number of minutes (between 0 and 59): " + mins);
	System.out.println("The 24h digital clock is displaying " + hours + " " + mins);
	}
}