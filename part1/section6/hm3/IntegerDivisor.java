package part1.section6.hm3;

import java.util.Scanner;

public class IntegerDivisor {

	public static void main(String[] args) {
		System.out.println("Enter the integer:\n");
		int number;

		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();

		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.println("\nInteger divisor of " + number + " number is " + i);
		}
	}
}