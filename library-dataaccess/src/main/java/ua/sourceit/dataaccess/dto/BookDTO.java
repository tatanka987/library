package ua.sourceit.dataaccess.dto;

public class BookDTO {

	private Integer id;
	private String author;
	private String name;
	private Integer year;
	private String summary;
	
	
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
		return name;
	}

	public void setBookName(String name) {
		this.name = name;
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}