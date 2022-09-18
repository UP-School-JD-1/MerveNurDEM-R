package part1.section12.hm1;

public class Shape {
	protected String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void draw() {
		System.out.println(name + " is drawing");
	}

	public void erase() {
		System.out.println(name + " is erasing");
	}

	public double calculateArea() {
		System.out.println("Calculating area.");
		return 0;
	}

	public double calculateCircumference() {
		return 0;
	}

}