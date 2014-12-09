package ua.sourceit.businessobject;

public class Book {

	private Integer id;
	private String author;
	private String bookName;
	private Integer year;
	private String summary;
	
	public Book() {}
		
	
	public Book(Integer id, String author, String bookName, Integer year, String summary) {
		setId(id); 
		setAuthor(author); 
		setBookName(bookName);
		setYear(year);
		setSummary(summary);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear (Integer year) {
		this.year = year;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary (String summary) {
		this.summary = summary;
	}
}
