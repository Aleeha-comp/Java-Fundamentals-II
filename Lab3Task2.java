import java.util.Scanner;

public class Lab3Task2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int N,K;
	int applesReceived;
	int applesLeft;
	System.out.print("Number of students: ");
	N = sc.nextInt();
	System.out.print("Number of apples: ");
	K = sc.nextInt();

	applesReceived = K/N;
	System.out.println("Each single student will get " + applesReceived);
	
	applesLeft = K%N;
	System.out.println("Remaining apples in the basket " + applesLeft);
	}
}

	