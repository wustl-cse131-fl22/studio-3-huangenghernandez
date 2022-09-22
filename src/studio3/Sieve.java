package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		/* Initialize Variables */
		boolean isPrime = false;
		
		System.out.print("Input number: ");
		int[] numbers = new int[in.nextInt()];
		for(int i = 0; i < numbers.length; i++){
			isPrime = true;
			numbers[i] = i+1;
			
			if (numbers[i] % 2 == 0 || numbers[i] % 3 == 0 || numbers[i] % 5 == 0 || numbers[i] % 7 == 0 ) {
				isPrime = false;
			}
			if (isPrime) {
				System.out.println(numbers[i] + " is a prime number!");
			}
			
			//Check for prime
			//System.out.println(numbers[i]);
		}
		

	}

}
