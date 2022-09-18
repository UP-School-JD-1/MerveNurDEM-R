package part1.section8.hm3;

public class Point {
	int m;
	int n;

	Point(int m, int n) {
		this.m = m;
		this.n = n;
	}

	Point(int m) {
		this(m, 0);
	}

	Point() {
		this(0, 0);
	}

	public int getM() {
		return m;
	}

	public void setX(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	double totalDistance() {

		int m1 = getM();
		int n1 = getN();
		double distance = Math.sqrt((m1 * m1) + (n1 * n1));
		System.out.println("M:" + m1 + " N:" + n1 + " distance to origin: " + distance);
		return distance;
	}

	double totalDistanceSecond(int a, int b) {
		double distance = Math.sqrt((Math.pow(getM() - a, 2)) + (Math.pow(getN() - b, 2)));
		System.out.println("(M1,Y1):" + "(" + getM() + "," + getN() + ") ve " + "(X2,Y2):" + "(" + a + "," + b
				+ ") distance between points: " + distance);
		return distance;
	}

	void clone(int m, int n) {
		setX(m);
		setN(n);
		System.out.println("New coordinat: " + "(" + m + "," + n + ")");
	}

	void move(int m, int n) {
		int m1 = getM();
		int n1 = getN();
		m1 = m + 3;
		n1 = n + 8;
		setX(m1);
		setN(n1);
		System.out.println("New coordinat: " + "(" + m1 + "," + n1 + ")");
	}

	public void printInfo() {
		System.out.println("\nPoint Info");
		System.out.println("M: " + m);
		System.out.println("N: " + n);
	}
}