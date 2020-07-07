package cn.hourinn.demo.staticfun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一千本书都来自同一家出版社
		List<Book> books = new ArrayList<>();
		for(int i=1;i<1000;i++) {
			Book book = new Book("funny book",i);
			books.add(book);
		}
		//修改出版社名称，需要逐一进行修改
		Iterator<Book> iterator = books.iterator();
		for (Book book : books) {
			book.setPublish("我要修改出版社名称");
		}
	}

}
