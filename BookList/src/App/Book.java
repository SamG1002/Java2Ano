package App;

public class Book {
	
	// Attributes
	
	private int id;
	private int year;
	private int pages;
	private String title;
	private String author;
	
	// Constructors
	
	public Book(int id, int year, int pages, String title, String author) {
		this.id = id;
		this.year = year;
		this.pages = pages;
		this.title = title;
		this.author = author;
	}
	
	public Book(int year, int pages, String title, String author) {
		this.year = year;
		this.pages = pages;
		this.title = title;
		this.author = author;
	}
	
	// Getters and Setters
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

}