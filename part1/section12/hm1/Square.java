package part1.section12.hm1;

public class Square extends Shape {
	
	private int edge;
	public Square(int edge) {
		super("Square");
		this.edge = edge;
	}

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}

	public void draw() {
		super.draw();
	}

	public void erase() {
		super.erase();
	}

	@Override
	public double calculateArea() {
		double area = edge * edge;
		System.out.println("Square area is : " + area);
		return area;
	}

	@Override
	public double calculateCircumference() {
		double circumference = 4 * edge;
		System.out.println("Square circumference is : " + circumference);
		return circumference;
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode: " + getName().hashCode());
		return getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Square c1 = (Square) obj;
		boolean a = false;
		if (getName() == c1.getName() && getEdge() == c1.getEdge()) {
			a = true;
		}
		System.out.println(a);
		return a;
	}

	@Override
	public String toString() {
		String s = new String();
		s = "Name: " + getName() + " & Edge:" + getEdge();
		System.out.println(s);
		return s;
	}
}
