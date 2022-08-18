package part1.section14;

public class ReaderTest {
	public static void main(String[] args) {
		Author author1 = new Author("ZÜLFÜ LİVANELİ");
		Author author2 = new Author("AZİZ NESİN");
		Book book1 = new Book(author1, "HUZURSUZLUK", 325, false, 20, BookType.FICTION);
		Book book2 = new Book(author2, "ZÜBÜK", 654, true, 0, BookType.DETECTIVE);
		Book book3 = new Book(author2, "AZİZNAME", 256, true, 99, BookType.DETECTIVE);
		Reader reader1 = new Reader("Z", 25, 'K', book1);
		Reader reader2 = new Reader("Y", 13, 'K', book2);
		Reader reader3 = new Reader("X", 49, 'E', book3);
		System.out.println("current page: " + book1.getCurrentPage());
		reader1.read(book1);
		System.out.println("current page: " + book1.getCurrentPage());
		reader2.read(book2);
		reader3.read(book3);

	}
}
