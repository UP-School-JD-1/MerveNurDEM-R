package part1.section10;

public class Point {
	int m;
	int n;

	Point(int m, int n) {
		this.m = m;
		this.n = n;
	}

	Point(int m) {
		this(m, 12);
	}

	Point() {
		this(5, 0);
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	double calculateDistanceToOrigin() {
		System.out.println("**** Distance To Origin ****");
		return Math.sqrt(Math.pow(m, 2) + Math.pow(n, 2));
	}

	double calculateDistanceToPoint(int k, int l) {
		System.out.println("\n**** Distance To Point  ****");
		return Math.sqrt((k - m) * (k - m) + (l - n) * (l - n));
	}

	void clone(int m, int n) {
		this.setM(m);
		this.setN(n);
		System.out.println("\n**** Clone Point ****");
		System.out.println("Clone m : " + m);
		System.out.println("Clone n : " + n);

	}

	void move(char direction, int amount) {
		if (direction == 'm')
			m += amount;
		else if (direction == 'n')
			n += amount;
		System.out.println("\n********   Move  ******** ");
		System.out.println("New coordinate m : " + m);
		System.out.println("New coordinate  n: " + n);
	}

}
