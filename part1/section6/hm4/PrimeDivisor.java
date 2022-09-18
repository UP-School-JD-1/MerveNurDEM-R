package part1.section6.hm4;

import java.util.Scanner;

public class PrimeDivisor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int number = scan.nextInt();
		int divisor = 2;
		int division = number;
		System.out.println("Prime divisors: ");
		while (divisor < number) {
			if (division % divisor == 0) {
				System.out.println(divisor);
				division /= divisor;
			} else {
				divisor++;
			}
		}
	}
}