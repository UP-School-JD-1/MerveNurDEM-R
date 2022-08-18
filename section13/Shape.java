package part1.section13;

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

	void draw() {
		System.out.println("\n\n*************************    " + name + "    *************************");

	}

	void erase() {
		System.out.println("Erasing\n\n");
	}

	double calculateArea1() {
		return 0.0;
	}

	double calculateCircumference() {
		return 0.0;
	}

	double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
