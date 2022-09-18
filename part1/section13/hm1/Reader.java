package part1.section13.hm1;

public class Reader {
	String name;
	int age;
	char gender;

	Reader(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	void read(Book book) {
		System.out.println("The book "+book.title+" is currently being read by "+ name );
	}

}
