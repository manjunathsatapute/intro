
public class Book {

	String color;
	int numOfPages;
	double price;

	Book() {
		System.out.println("creating Book object");
	}

	void readingBook() {
		System.out.println("Reading books");
	}

	void writingBook() {
		System.out.println("writing notes");
	}

	void turnPages() {
		System.out.println("Turn pages after reading");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		Book lekhakBooks = new Book();
		lekhakBooks.color = "white";
		lekhakBooks.numOfPages = 200;
		lekhakBooks.price = 35;

		System.out.println();

		System.out.println("color: " + lekhakBooks.color);
		System.out.println("number of pages: " + lekhakBooks.numOfPages);
		System.out.println("price: " + lekhakBooks.price);

		System.out.println();

		lekhakBooks.readingBook();
		lekhakBooks.writingBook();
		lekhakBooks.turnPages();

		System.out.println("Main Method Ended");
	}
}
