package cn.hourinn.demo.staticfun;

public class Book {
	private String title;
	private double price;
	String publish = "不靠谱出版社";
	
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", publish=" + publish + "]";
	}
	
	
	
}
