package part1.section12.hm1;

public class Rectangle extends Shape {
	private int shortEdge;
	private int longEdge;

	public Rectangle(int shortEdge, int longEdge) {
		super("Rectangle");
		this.shortEdge = shortEdge;
		this.longEdge = longEdge;
	}

	public int getShortEdge() {
		return shortEdge;
	}

	public void setShortEdge(int shortEdge) {
		this.shortEdge = shortEdge;
	}

	public int getLongEdge() {
		return longEdge;
	}

	public void setLongEdge(int longEdge) {
		this.longEdge = longEdge;
	}

	@Override
	public void draw() {
		super.draw();
	}

	@Override
	public void erase() {
		super.erase();
	}

	@Override
	public double calculateArea() {
		double area = shortEdge * longEdge;
		System.out.println("Rectangle area is: " + area);
		return area;
	}

	@Override
	public double calculateCircumference() {
		double circumference = 2 * (shortEdge + longEdge);
		System.out.println("Rectangle circumference is: " + circumference);
		return circumference;
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode: " + getName().hashCode());
		return getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle c1 = (Rectangle) obj;
		boolean a = false;
		if (getName() == c1.getName() && getShortEdge() == c1.getShortEdge()) {
			a = true;
		}
		System.out.println(a);
		return a;
	}

	@Override
	public String toString() {
		String s = new String();
		s = "Name: " + getName() + " & x-y:" + getShortEdge() + getLongEdge();
		System.out.println(s);
		return s;
	}
}
