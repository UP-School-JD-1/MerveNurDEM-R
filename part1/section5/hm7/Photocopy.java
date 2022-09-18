package part1.section5.hm7;

public class Photocopy {

	static int cost2 = 0;

	public static void main(String[] args) {

		int n = 150;
		int cost1 = calculateCost(n);
		System.out.println("Cost of " + n + " copies is " + cost1 + " kuruş");

		calculateCostRecursively(n);
		System.out.println("Cost of " + n + " copies is " + cost2 + " kuruş");
	}

	public static int calculateCost(int numberOfCopy) {
		int cost = 0;
		int numberOf25 = numberOfCopy / 25;
		cost += numberOf25 * 100;
		numberOfCopy -= numberOf25 * 25;
		int numberOf12 = numberOfCopy / 12;
		cost += numberOf12 * 50;
		numberOfCopy -= numberOf12 * 12;
		cost += numberOfCopy * 5;
		return cost;
	}

	public static void calculateCostRecursively(int numberOfCopy) {
		int numberOf25 = numberOfCopy / 25;
		if (numberOf25 > 0) {
			cost2 += numberOf25 * 100;
			numberOfCopy -= numberOf25 * 25;
			calculateCostRecursively(numberOfCopy);
		}
		int numberOf12 = numberOfCopy / 12;
		if (numberOf12 > 0) {
			cost2 += numberOf12 * 50;
			numberOfCopy -= numberOf12 * 12;
			calculateCostRecursively(numberOfCopy);
		}

		cost2 += numberOfCopy * 5;
	}

}
