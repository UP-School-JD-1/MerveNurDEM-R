package part1.section5.hm5;

import java.util.Scanner;

public class TotalPrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count;

		System.out.println("Enter a number: ");
		int number = scan.nextInt();

		while (number > 2) {

			count = 0;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(number + " is a prime number.");
			}
			number--;
		}
	}
}