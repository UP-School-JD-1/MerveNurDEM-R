package part1.section5.hm6;

//1) Uniformly select a random point on the graph (a,b)

//2) If a² + b² ≤ 1: the point is on/in the circle. Otherwise, it is outside.

//3) Prob[(x,y) is in the circle] ≈ number of points found to be within the circle / total number of trials.

//4) Approximate using π ≈ 4 * P[(x,y) is in the circle]

import java.util.Random;

public class MonteCarloPi {

	private static final Random r = new Random();

	private static int n = 1000000;

	public static void main(String[] args) {

		n = args.length > 0 ? Integer.parseInt(args[0]) : n;

		double pi_approx = 3.0;
		double n = 0.0;

		for (int trial = 1; trial <= n; trial++) {

			Double x = r.nextDouble();
			Double y = r.nextDouble();

			if ((x * x) + (y * y) <= 1)
				n++;

		}
		System.out.println(pi_approx);
	}
}
