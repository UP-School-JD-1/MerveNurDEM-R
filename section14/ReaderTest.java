package part1.section14;

public class ReaderTest {
	public static void main(String[] args) {
		Author author1 = new Author("ZULFU LIVANELI");
		Author author2 = new Author("AZIZ NESIN");
		Book book1 = new Book(author1, "HUZURSUZLUK", 325, false, 20, BookType.ROMANCE);
		Book book2 = new Book(author2, "ZUBUK", 654, true, 0, BookType.HISTORY);
		Book book3 = new Book(author2, "AZIZNAME", 256, true, 99, BookType.HISTORY);
		Reader reader1 = new Reader("Z", 65, 'A', book1);
		Reader reader2 = new Reader("Y", 87, 'B', book2);
		Reader reader3 = new Reader("X", 47, 'C', book3);
		System.out.println("current page: " + book1.getCurrentPage());
		reader1.read(book1);
		System.out.println("current page: " + book1.getCurrentPage());
		reader2.read(book2);
		reader3.read(book3);

	}
}