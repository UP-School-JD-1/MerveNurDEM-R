package part1.section2.hm4;

public class Deneme {
	public static int my_method(int num1, int num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {

		int a = my_method(19, 38);
		int b = my_method(18, 81);
		int c = my_method(19, 23);

		System.out.println("Result a from my_method: " + a);
		System.out.println("Result b from my_method: " + b);
		System.out.println("Result c from my_method: " + c);

	}
}
