package part2.section8.hm2;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BookTest {

	public static void main(String[] args) {

		Book book1 = new Book("X", "Y", "Z", 984);
		Book book2 = new Book("XX", "YY", "ZZ", 365);
		Book book3 = new Book("XXX", "YYY", "ZZZ", 548);
		Book book4 = new Book("XXXX", "YYYY", "ZZZZ", 478);

		Comparator<Book> comparatorByPageNumber = (b1, b2) -> b1.getPages() - b2.getPages();

		BinaryOperator<Book> maxPageNumberOperator = BinaryOperator.maxBy(comparatorByPageNumber);

		System.out.println("\nComparing " + book1.getPages() + " and " + book2.getPages());

		System.out.println("Max page number: " + maxPageNumberOperator.apply(book1, book2).getPages());

		System.out.println("\nComparing " + book3.getPages() + " and " + book4.getPages());

		System.out.println("Max page number: " + maxPageNumberOperator.apply(book3, book4).getPages());
	}
}