package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		/* Initalize Variables */
		
		System.out.print("Input number: ");
		int[] numbers = new int[in.nextInt()];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i+1;
			System.out.println(numbers[i]);
		}
		

	}

}
