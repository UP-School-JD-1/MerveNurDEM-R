package Part1Section2Hm3;

public class HelloTest {
	public static void main(String[] args) {
		Hello object = new Hello();

		String answer = object.sayHello("Merve");

		System.out.println(answer);

		answer = object.sayHello("Nur");

		System.out.println(answer);

		System.out.println("World: " + object.world);

		answer = object.sayHello("");

		System.out.println(answer);

	}
}
