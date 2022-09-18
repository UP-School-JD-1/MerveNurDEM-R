package part1.section8.hm2;

public class ReaderTest {
	public static void main(String[] args) {
		Author author = new Author("Walter Isaacson");
		Book book = new Book("Huzursuzluk", "Roman", 200, 0, true, author, BookType.NOVEL);
		Book book2 = new Book("Steve Jobs", "Biography", 100, 20, false, author, BookType.BIOGRAPHY);

		book2.getBookType();

		Reader reader = new Reader("Merve Nur", 27, 'F');

		reader.read(book);
		book.currentPageCounter(90);
		book.currentPageCounter(10);

		System.out.println(author.authorName + " " + book.type + " as written a biography.");

		reader.read(book2);
	}

}
