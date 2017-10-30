package Problem2;

public class Textbook {
	private String isbn, title, author;
	public String toString () {
		return isbn + " " + title + " " + author;
	}
	public Textbook (String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIsbn() {
		return isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public boolean equals(Object o) {
		if (this.getClass() != o.getClass() || o == null)
			return false;
		Textbook t = (Textbook) o;
		if (!t.isbn.equals(isbn))
	       	return false;
		return true;
	}
}
